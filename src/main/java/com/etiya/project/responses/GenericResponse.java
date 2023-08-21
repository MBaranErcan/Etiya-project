package com.etiya.project.responses;

import com.etiya.project.Common.GeneralEnumerations;
import com.etiya.project.DTOs.User;

public class GenericResponse<T> {

    private T t;
    private String message;
    private int returnCode;

    public GenericResponse(T t, String message, int returnCode) {
        this.t = t;
        this.message = message;
        this.returnCode = returnCode;
    }

    public static <T> GenericResponse<T> successResponse(T t) {
        return new GenericResponse<>(t,"Success!", GeneralEnumerations.ReturnCode.SUCCESS.getReturnCode());
    }
    public static <T> GenericResponse<T> failedResponse(T t) {
        return new GenericResponse<>(t,"Error!", GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }
    public static <T> GenericResponse<T> failedResponse(T t, String message) {
        return new GenericResponse<>(t, message, GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }
}