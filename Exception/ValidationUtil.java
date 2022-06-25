package Exception;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if( loginRequest.getUsername().isBlank()) throw new ValidationException("User tidak boleh kosong!");
        else if (loginRequest.getPassword().isBlank()) throw new ValidationException("Password tidak boleh kosong!");
    }
}
