
public class test {
    public static void main(String[] args) {
        person megu = new person("Megumin", false,false);
        person iroha = new person("Iroha",false,false);

        boolean meguThighs = megu.getThighs();
        boolean meguSmug = megu.getSmug();
        boolean irohaThighs = iroha.getThighs();
        boolean irohaSmug = iroha.getSmug();

        boolean meguTrue;
        boolean irohaTrue;

        if (!meguThighs) {
            meguTrue = false;
        }
            else if (!meguSmug) {
                meguTrue = false;
        }
        else {
            meguTrue = true;
        }

        if (!irohaSmug) {
            irohaTrue = false;
        }
            else if (!irohaThighs) {
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

        if (meguTrue && irohaTrue) {
            System.out.println("THEY'RE THE SAME PERSON: " + megu.getName() + " is == to " + iroha.getName());
        }
        else if (!meguTrue && !irohaTrue){
            System.out.println("THEY'RE THE SAME, BUT IN A BAD WAY... EVERYTHING IS FALSE");
        }
        else {
            System.out.println("THEY'RE NOT THE SAME :(");
        }
    }
}
