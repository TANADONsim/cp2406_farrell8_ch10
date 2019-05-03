package Q7;

public class UsePackage
{
    public static void main(String[] args)
    {
        Package[] packageArray = new Package[3];
        packageArray[0] = new Package(3, 'A');
        packageArray[1] = new Package(10, 'T');
        packageArray[2] = new Package(15, 'M');

        InsuredPackage[] insuredPackageArray = new InsuredPackage[3];
        insuredPackageArray[0] = new InsuredPackage(14, 'M');
        insuredPackageArray[1] = new InsuredPackage(4, 'T');
        insuredPackageArray[2] = new InsuredPackage(20, 'A');

        System.out.println("Displaying Packages");
        for(Package p : packageArray)
            p.display();

        System.out.println("\nDisplaying Insured Packages");
        for(InsuredPackage ip : insuredPackageArray)
            ip.display();
    }
}