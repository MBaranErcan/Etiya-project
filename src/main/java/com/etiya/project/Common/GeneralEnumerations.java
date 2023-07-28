package com.etiya.project.Common;

public class GeneralEnumerations {

    public enum GeneralType {
        RESIDENTIAL(1L),
        VIP(2L),
        CORPO(3L);

        private Long id;

        GeneralType(Long id){
            this.id = id;
        }

        public Long getId() {
            return id;
        };
    }

    public enum GeneralStatus {
        ACTIVE(1L),
        PASSIVE(2L),
        SUSPENDED(3L);

        private Long id;

        GeneralStatus(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
    }

    public enum ReturnCode {
        SUCCESS(200),
        ERROR(500);

        private int returnCode;

        ReturnCode(int returnCOde) {
            this.returnCode = returnCOde;
        }

        public int getReturnCode() {
            return returnCode;
        }
    }
    
}
