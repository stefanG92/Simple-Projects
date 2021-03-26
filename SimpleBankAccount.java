import java.util.Scanner;

public class SimpleBankAccount {

    static class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        public BankAccount(String name, String id) {
            this.customerName = name;
            this.customerId = id;
        }

        void deposit(int amount) {

            if (amount != 0) {
                balance += amount;
                previousTransaction = amount;
            }
        }

        void withdraw(int amount) {

            if (amount != 0) {
                balance -= amount;
                previousTransaction = amount;
            }
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);

            } else if (previousTransaction < 0) {
                System.out.println("Withdraw: " + Math.abs(previousTransaction));

            } else {
                System.out.println("No Transaction Occured!");
            }

        }

        void showMenu() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome " + customerName);
            System.out.println("Your ID is: " + customerId);
            System.out.println();
            System.out.println();

            System.out.println("==================================================================================================");
            System.out.println("A Check Balance");
            System.out.println("B Deposit");
            System.out.println("C Withdraw");
            System.out.println("D Previous Transaction");
            System.out.println("E Exit of the System");
            System.out.println("==================================================================================================");


            System.out.println("Enter your option:");
            System.out.println();

            char personSelect = scanner.nextLine().charAt(0);

            while (personSelect != 'E') {
                switch (personSelect) {
                    case 'A':
                        System.out.println("Your option is Balance");
                        System.out.println("****************************************************");
                        System.out.println("Your Balance: " + balance);
                        System.out.println("****************************************************");
                        break;
                    case 'B':
                        System.out.println("Your option is Deposit");
                        System.out.println("Enter your Amount");
                        int amount = Integer.parseInt(scanner.nextLine());
                        System.out.println("Your Amount: " + amount);
                        deposit(amount);
                        System.out.println("****************************************************");
                        System.out.println("Balance: " + balance);
                        System.out.println("****************************************************");
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("Your option is Withdraw");
                        System.out.println("Enter your Amount");
                        int amountForWithdraw = Integer.parseInt(scanner.nextLine());
                        System.out.println("Your Amount: " + amountForWithdraw);
                        withdraw(amountForWithdraw);
                        System.out.println("****************************************************");
                        System.out.println("Balance: " + balance);
                        System.out.println("****************************************************");
                        System.out.println();

                        break;
                    case 'D':
                        System.out.println("Your option is Previous Transaction");
                        getPreviousTransaction();
                        break;
                    default:
                        System.out.println("!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?");
                        System.out.println("Invalid option!");
                        System.out.println("!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?");
                        break;

                }
                System.out.println("You can enter option again!");
                personSelect = scanner.nextLine().charAt(0);

            }

            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Thank you for using our system");
            System.out.println("Have a nice day of our team");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");


        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String client = scanner.nextLine();
        String id = scanner.nextLine();

        BankAccount bankAccount = new BankAccount(client, id);
        bankAccount.showMenu();

    }
}
