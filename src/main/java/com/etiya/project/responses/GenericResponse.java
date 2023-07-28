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

    public GenericResponse(String message, int returnCode) {
        this.message = message;
        this.returnCode = returnCode;
    }

    // CREATE (POST) Responses
    public static GenericResponse<?> createSuccessResponse() {
        return new GenericResponse<>("Success!", GeneralEnumerations.ReturnCode.SUCCESS.getReturnCode());
    }
    public static GenericResponse<?> createFailedResponse() {
        return new GenericResponse<>("Error!", GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }
    public static GenericResponse<?> createFailedResponse(String message) {
        return new GenericResponse<>(message, GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }

    // Inquire User (Get) Responses
    public static GenericResponse<?> inquireSuccessResponse(User user) {
        return new GenericResponse<>(user, "Success!", GeneralEnumerations.ReturnCode.SUCCESS.getReturnCode());
    }
    public static GenericResponse<?> inquireFailedResponse() {
        return new GenericResponse<>("Error!", GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }
    public static GenericResponse<?> inquireFailedResponse(String message) {
        return new GenericResponse<>(message, GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }

}
