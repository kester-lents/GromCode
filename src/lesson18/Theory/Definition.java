package lesson18.Theory;

/**
 * Created by Ruslan on 11.05.2018.
 */
public class Definition {
    private void notifyUsers(String[] usersEmails) {

        for (String email : usersEmails) {

            //обработка ошибки
            try {
                //send email to user - error
                System.out.println("Email " + email + " was sent");
            } catch (Exception e) {
                //how should i handle exception
                System.err.println("Email " + email + " was not sent");
            }
        }
    }
}
