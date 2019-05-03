public class FixDebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    FixDebugCustomerMakingPurchase(int id,
                                   String name, double credit, double purchAmount)
    {
        super();
        amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
    }

    public FixDebugCustomerMakingPurchase(int id, double credit, String name, double purchase) {

    }

    @Override
    public void display()
    {
       display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
