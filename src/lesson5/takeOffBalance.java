    package lesson5;

    import java.util.Arrays;

    /**
     * Created by Ruslan on 12.06.2017.
     */
    public class takeOffBalance {
        public static void main(String[] args) {
            String clients[] = {"John", "Pedro", "Valera", "Muchachos", "Vovan"};
            int[] balances = {1, 100, -3500, 222, 1234};
            System.out.println(withdraw(clients, balances, "Muchachos", 200));
            System.out.println(Arrays.toString(balances));
        }

        public static int withdraw(String[] clients, int[] balances, String client, int amount) {
            int res = balances [findClient(clients, client)] - amount;
            if (res >= 0) {
               return balances [findClient(clients, client)] = res;
            }
            else {
                return -1;
            }
        }
        public static int findClient (String [] clients, String client) {

            int clientIndex = 0;
            for (String person : clients) {
                if (person == client) {
                    break;
                }
                clientIndex++;
            }
            return clientIndex;
        }

    }



