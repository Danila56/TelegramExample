import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthCheckedPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443",84913,"6eca7eaa77004dd6036e8bcd9446e490");
        System.out.println("Введите свой номер телефона");
        AuthCheckedPhone authCheckedPhone = bridge.authCheckPhone(bufferedReader.readLine().trim());
        System.out.println(authCheckedPhone.isRegistered());
    }
}
