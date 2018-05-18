    package lesson5;

    /**
     * Created by Ruslan on 12.06.2017.
     */
    public class takeOffBalance_Andrey {
        public static void main(String[] args) {
            String clients[] = {"John", "Pedro", "Valera", "Muchachos", "Vovan"};
            int[] balances = {1, 100, -3500, 222, 1234};
            System.out.println(withdraw(clients, balances, "Muchachos", 200));
        }

        public static int withdraw(String[] clients, int[] balances, String client, int amount) {
            int clientIndex = findClient(clients, client);
            if (balances [clientIndex] < amount) //я не учел, что если баланс меньше отнимаемой суммы, то и вычитание лишнее
                return -1;

            balances [clientIndex] -= amount;
               return balances [clientIndex];

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



