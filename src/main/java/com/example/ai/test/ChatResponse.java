//package com.example.ai.test;
//
//import java.util.List;
//
//public class ChatResponse {
//
//    private List<Choise> choises;
//
//    public ChatResponse(List<Choise> choises) {
//        this.choises = choises;
//    }
//
//    public ChatResponse() {
//
//    }
//
//
//    public List<Choise> getChoises() {
//        return choises;
//    }
//
//    public void setChoises(List<Choise> choises) {
//        this.choises = choises;
//    }
//
//    public static class Choise{
//
//        private int index;
//        private Message message;
//
//        public Choise(int index, Message message) {
//            this.index = index;
//            this.message = message;
//        }
//
//        public int getIndex() {
//            return index;
//        }
//
//        public void setIndex(int index) {
//            this.index = index;
//        }
//
//        public Message getMessage() {
//            return message;
//        }
//
//        public void setMessage(Message message) {
//            this.message = message;
//        }
//    }
//
//
//}
package com.example.ai.test;

import java.util.List;

//public class ChatResponse {
//
//    private List<Choise> choises;
//
//
//
//    public ChatResponse() {
//        // Default constructor
//    }
//
//    public List<Choise> getChoises() {
//        return choises;
//    }
//
//    public void setChoises(List<Choise> choises) {
//        this.choises = choises;
//    }
//
//    public static class Choise {
//        private int index;
//        private Message message;
////        private String finish_reason;
//
//        public int getIndex() {
//            return index;
//        }
//
//        public void setIndex(int index) {
//            this.index = index;
//        }
//
////        public String getFinish_reason() {
////            return finish_reason;
////        }
////
////        public void setFinish_reason(String finish_reason) {
////            this.finish_reason = finish_reason;
// //       }
//
//        public Message getMessage() {
//            return message;
//        }
//
//        public void setMessage(Message message) {
//            this.message = message;
//        }
//    }
//}
public class ChatResponse {

    private Choice[] choices;

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

    public static class Choice {
        private int index;
        private Message message;
        private String finish_reason;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getFinishReason() {
            return finish_reason;
        }

        public void setFinishReason(String finish_reason) {
            this.finish_reason = finish_reason;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    public static class Message {
        private String role;
        private String content;

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
