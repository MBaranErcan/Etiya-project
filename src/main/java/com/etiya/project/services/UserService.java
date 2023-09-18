package com.etiya.project.services;

import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.DTOs.GeneralType;
import com.etiya.project.DTOs.User;
import com.etiya.project.Mappers.UserMapper;
import com.etiya.project.entities.GnlStEntity;
import com.etiya.project.entities.GnlTpEntity;
import com.etiya.project.entities.UserEntity;
import com.etiya.project.exceptions.BusinessValidationException;
import com.etiya.project.repository.GnlStRepository;
import com.etiya.project.repository.GnlTpRepository;
import com.etiya.project.repository.UserRepository;
import com.etiya.project.requests.CreateUserRequest;
import com.etiya.project.requests.InquireUserRequest;
import com.etiya.project.responses.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GnlStRepository gnlStRepository;
    @Autowired
    private GnlTpRepository gnlTpRepository;

    //Post /user
    public GenericResponse createUser(CreateUserRequest request) {
        // Validate Username
        validateIsUsernameAvailable(request);
        // PASSWORD VALIDATION
        this.validatePasswordTooShort(request);

        UserEntity userEntity = new UserEntity();

        userEntity.setuName(request.getuName());
        userEntity.setPwd(request.getPwd());
        userEntity.setScrName(request.getScrName());

        userEntity.setCdate(LocalDate.now());
        userEntity.setCuser(String.valueOf(0L));

        try {
            GnlTpEntity gnlTp = this.gnlTpRepository.findByShrtCodeAndActv(request.getUserType(), true);
            if (gnlTp != null)
                userEntity.setGnlTpEntity(gnlTp);
            else {
                throw new BusinessValidationException("No UserType could be found: ", "details: " + request.getUserType());
            }

            GnlStEntity gnlSt = this.gnlStRepository.findByShrtCodeAndActvAndEntCodeName(request.getUserStatus(), true, "usr");
            if (gnlSt != null)
                userEntity.setGnlStEntity(gnlSt);
            else {
                throw new BusinessValidationException("No UserStatus could be found: ", "details: " + request.getUserStatus());
            }
        } catch (BusinessValidationException e) {
            return GenericResponse.failedResponse(userEntity, e.getMessage() + e.getDetails());
        } catch (Exception e) {
            return GenericResponse.failedResponse(userEntity, e.getMessage());
        }

        userRepository.save(userEntity);
        return GenericResponse.successResponse(userEntity.getUserId());
    }

    // InquireUser
    public GenericResponse<User> inquireUser(@RequestBody InquireUserRequest request) {

        User user = new User();
        try {
            UserEntity userEntity = this.userRepository.findByuName(request.getuName());
            if (userEntity == null) {
                throw new BusinessValidationException("No User could be found with the username: "+ request.getuName(), request.getuName());
            }
            this.validatePasswordIsCorrect(request, userEntity);
            user = toUser(userEntity);


        } catch (Exception e) {
            return GenericResponse.failedResponse(user , e.getMessage());
        }

        return  GenericResponse.successResponse(user);
    }

/*    //DELETE /user
    public void deleteUser(UserEntity user) {
        userRepository.delete(user);
    }*/

    // PASSWORD LENGTH min 5
    private void validatePasswordTooShort(CreateUserRequest request){
        if (request.getPwd().length() < 5) {
            throw new BusinessValidationException("Password too short!", request.getPwd());
        }
    }
    // PASSWORD Is it Correct
    private void validatePasswordIsCorrect(InquireUserRequest request, UserEntity user) {
        if (!user.getPwd().equals(request.getPwd())) {
            throw new BusinessValidationException("Password is not correct!", request.getPwd());
        }
    }

    // Username Validation
    private void validateIsUsernameAvailable(CreateUserRequest request) {
        UserEntity userEntity = userRepository.findByuName(request.getuName());
        if (userEntity != null) {   // Check if username is taken
            throw new BusinessValidationException("This username is taken ", request.getuName());
        }
        if (request.getuName().length() < 2) {  // Check if Username length is min 2
            throw new BusinessValidationException("Username should be longer thand 2 chracters!", request.getuName());
        }
    }


    // Converter from UserEntity to UserDTO.
    private User toUser(UserEntity userEntity) {
        User user = new User();
        user.setUserId(userEntity.getUserId());
        user.setUserName(userEntity.getuName());
        user.setScreenName(userEntity.getScrName());

        GnlStEntity gnlStEntity = gnlStRepository.findByGnlStId(userEntity.getGnlStEntity().getGnlStId());
        GnlTpEntity gnlTpEntity = gnlTpRepository.findByGnlTpId(userEntity.getGnlTpEntity().getGnlTpId());

        GeneralStatus generalStatus = new GeneralStatus();
        generalStatus.setName(gnlStEntity.getName());
        generalStatus.setActive(gnlStEntity.getActv());
        generalStatus.setDescription(gnlStEntity.getDescr());
        generalStatus.setGeneralStatusId(gnlStEntity.getGnlStId());
        generalStatus.setShortCode(gnlStEntity.getShrtCode());
        generalStatus.setEntityCodeName(gnlStEntity.getEntCodeName());

        GeneralType generalType = new GeneralType();
        generalType.setName(gnlTpEntity.getName());
        generalType.setIsActive(gnlTpEntity.getActv());
        generalType.setDescription(gnlTpEntity.getDescr());
        generalType.setGeneralTypeId(gnlTpEntity.getGnlTpId());
        generalType.setShortCode(gnlTpEntity.getShrtCode());
        generalType.setEntityCodeName(gnlTpEntity.getEntCodeName());


        user.setGeneralStatus(generalStatus);
        user.setGeneralType(generalType);

        return user;
    }

}
