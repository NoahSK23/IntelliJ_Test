
public class test {
    public static void main(String[] args) {
        person megu = new person("Megumin", true,true);
        person iroha = new person("Iroha",true,true);

        boolean meguThighs = megu.getThighs();
        boolean meguSmug = megu.getSmug();
        boolean irohaThighs = iroha.getThighs();
        boolean irohaSmug = iroha.getSmug();

        boolean meguTrue;
        boolean irohaTrue;

        if (meguThighs == false) {
            meguTrue = false;
        }
            else if (meguSmug == false) {
                meguTrue = false;
        }
        else {
            meguTrue = true;
        }

        if (irohaSmug == false) {
            irohaTrue = false;
        }
            else if (irohaThighs == false) {
                irohaTrue = false;
        }
        else {
            irohaTrue = true;
        }
        /*
        System.out.println(meguThighs);
        System.out.println(meguSmug);
        System.out.println(irohaThighs);
        System.out.println(irohaSmug);
        System.out.println(meguTrue);
        System.out.println(irohaTrue);
        */

        //System.out.println(meguTrue == irohaTrue);

        if (meguTrue && irohaTrue == true) {
            System.out.println("THEY'RE THE SAME PERSON: " + megu.getName() + " is == to " + iroha.getName());
        }
        else {
            System.out.println("THEY'RE NOT THE SAME :(");
        }
    }
}
