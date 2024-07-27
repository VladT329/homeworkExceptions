public class Main {
    public static void main(String[] args) {
        try {
            Service.isValid("ghjlkL_","fgjjSSW468","fgjjSSW468");
        } catch (WrongLoginException e) { ///сорздали ошибку
            throw new RuntimeException(e); ///решение
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
