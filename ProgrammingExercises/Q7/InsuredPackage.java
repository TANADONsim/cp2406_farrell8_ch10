package Q7;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class InsuredPackage extends Package
{
    private final double[] INSURANCE = {2.45, 3.95, 5.55};

    private double shippingBefore;
    private double shippingCost;
    private double insuranceCost;

    public InsuredPackage(int w, char m)
    {
        super(w, m);

        this.calculateShipping();
    }

    public void calculateShipping()
    {
        shippingBefore = super.getShippingCost();
        if(shippingBefore <= 1.00)
            insuranceCost = INSURANCE[0];
        else if(shippingBefore >= 1.01 && shippingBefore <= 3.00)
            insuranceCost = INSURANCE[1];
        else if(shippingBefore >= 3.01)
            insuranceCost = INSURANCE[2];

        shippingCost = shippingBefore + insuranceCost;
    }

    public void display()
    {
        // Make pretty money format
        DecimalFormat f = new DecimalFormat("##.00");
        String formattedShippingCost = f.format(shippingCost);
        String formattedInsuranceCost = f.format(insuranceCost);

        String displayString = "";
        displayString += "Weight: " + super.getWeight();
        displayString += "\nShipping Method: " + super.getShippingMethod();
        displayString += "\nInsurance: $" + formattedInsuranceCost;
        displayString += "\nShipping Cost with insurance: $" + formattedShippingCost;

        JOptionPane.showMessageDialog(null, displayString);
    }
}
