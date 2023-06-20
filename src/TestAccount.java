public class TestAccount {
    public static void main(String[] args) {
        Account ac1=new Account(356786,4000);
        Account ac2=new Account(543987,500);

        // To print account 1 and 2, their A/C number and balance.
        details(ac1,ac2);

        System.out.println("----------- After Depositing 6000 from account 1 -------------");
        ac1.credit(6000);
        details(ac1,ac2);

        System.out.println("----------- After withdrawing 12000 from account 1 -------------");
        System.out.println("*** This withdrawal can not be allowed ***");
        ac1.debit(12000); /* This withdrawal can not be allowed,
        Therefor, the account balance also should not be changed.*/
        details(ac1,ac2);

        System.out.println("----------- After withdrawing 1000 from account 1 -------------");
        ac1.debit(1000);
        details(ac1,ac2);

        System.out.println("----------- After transferring  3000 from account 1 to account 2 -------------");
        ac1.transferTo(3000,ac2);
        details(ac1,ac2);
    }

    public static void details(Account ac1,Account ac2){
        System.out.println(ac1.toString());
        System.out.println(ac2.toString());
    }
}
