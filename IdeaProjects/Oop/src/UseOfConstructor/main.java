package UseOfConstructor;

public class main {
    public main() {
    }

    public static void main(String[] args) {

        bankAccount mahadeAccount=new bankAccount("Xyz123",2345.89,
                "Mahade Jhonny","mahadeh999@gmail.com",34753661);








        mahadeAccount.depositFunds(500);
        mahadeAccount.withdrawFunds(700);
        mahadeAccount.withdrawFunds(300);



    }
}
