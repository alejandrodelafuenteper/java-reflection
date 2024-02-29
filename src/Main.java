import java.lang.reflect.Field;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Preigom preigomWithoutReflection = InitializeDataWithoutReflection();

        //TODO complete this method.
        Preigom preigomWithReflection = InitializeDataWithReflection();

        PrintObjectWithoutReflection(preigomWithoutReflection);

        //TODO change to preigomWithReflection.
        PrintObjectWithReflection(preigomWithoutReflection);

        if(preigomWithoutReflection.equals(preigomWithReflection)){
            System.out.println("The objects: " + preigomWithoutReflection.getName()+" and "
                    + preigomWithReflection.getName() +" are equal.");
        }
        else{
            System.out.println("The objects: " + preigomWithoutReflection.getName()+" and "
                    + preigomWithReflection.getName() +" are NOT equal.");
        }

    }

    private static Preigom InitializeDataWithoutReflection() {
        Preigom preigom = new Preigom();
        preigom.setName("Object without Reflection");

        preigom.setCodImport1("codAmount1");
        preigom.setUbi1("ubi1");
        preigom.setAccode1("accode1");
        preigom.setCodInter1("codInter1");
        preigom.setCl1("cl1");
        preigom.setCurrencySign1("currencySign1");
        preigom.setAmount1("amount1");
        preigom.setCurrency1("currency1");

        preigom.setCodImport2("codAmount2");
        preigom.setUbi2("ubi2");
        preigom.setAccode2("accode2");
        preigom.setCodInter2("codInter2");
        preigom.setCl2("cl2");
        preigom.setCurrencySign2("currencySign2");
        preigom.setAmount2("amount2");
        preigom.setCurrency2("currency2");


        preigom.setCodImport3("codAmount3");
        preigom.setUbi3("ubi3");
        preigom.setAccode3("accode3");
        preigom.setCodInter3("codInter3");
        preigom.setCl3("cl3");
        preigom.setCurrencySign3("currencySign3");
        preigom.setAmount3("amount3");
        preigom.setCurrency3("currency3");

        preigom.setCodImport4("codAmount4");
        preigom.setUbi4("ubi4");
        preigom.setAccode4("accode4");
        preigom.setCodInter4("codInter4");
        preigom.setCl4("cl4");
        preigom.setCurrencySign4("currencySign4");
        preigom.setAmount4("amount4");
        preigom.setCurrency4("currency4");

        preigom.setCodImport5("codAmount5");
        preigom.setUbi5("ubi5");
        preigom.setAccode5("accode5");
        preigom.setCodInter5("codInter5");
        preigom.setCl5("cl5");
        preigom.setCurrencySign5("currencySign5");
        preigom.setAmount5("amount5");
        preigom.setCurrency5("currency5");

        preigom.setCodImport6("codAmount6");
        preigom.setUbi6("ubi6");
        preigom.setAccode6("accode6");
        preigom.setCodInter6("codInter6");
        preigom.setCl6("cl6");
        preigom.setCurrencySign6("currencySign6");
        preigom.setAmount6("amount6");
        preigom.setCurrency6("currency6");

        preigom.setCodImport7("codAmount7");
        preigom.setUbi7("ubi7");
        preigom.setAccode7("accode7");
        preigom.setCodInter7("codInter7");
        preigom.setCl7("cl7");
        preigom.setCurrencySign7("currencySign7");
        preigom.setAmount7("amount7");
        preigom.setCurrency7("currency7");

        preigom.setCodImport8("codAmount8");
        preigom.setUbi8("ubi8");
        preigom.setAccode8("accode8");
        preigom.setCodInter8("codInter8");
        preigom.setCl8("cl8");
        preigom.setCurrencySign8("currencySign8");
        preigom.setAmount8("amount8");
        preigom.setCurrency8("currency8");

        preigom.setCodImport9("codAmount9");
        preigom.setUbi9("ubi9");
        preigom.setAccode9("accode9");
        preigom.setCodInter9("codInter9");
        preigom.setCl9("cl9");
        preigom.setCurrencySign9("currencySign9");
        preigom.setAmount9("amount9");
        preigom.setCurrency9("currency9");

        preigom.setCodImport10("codAmount10");
        preigom.setUbi10("ubi10");
        preigom.setAccode10("accode10");
        preigom.setCodInter10("codInter10");
        preigom.setCl10("cl10");
        preigom.setCurrencySign10("currencySign10");
        preigom.setAmount10("amount10");
        preigom.setCurrency10("currency10");

        preigom.setCodImport11("codAmount11");
        preigom.setUbi11("ubi11");
        preigom.setAccode11("accode11");
        preigom.setCodInter11("codInter11");
        preigom.setCl11("cl11");
        preigom.setCurrencySign11("currencySign11");
        preigom.setAmount11("amount11");
        preigom.setCurrency11("currency11");

        preigom.setCodImport12("codAmount12");
        preigom.setUbi12("ubi12");
        preigom.setAccode12("accode12");
        preigom.setCodInter12("codInter12");
        preigom.setCl12("cl12");
        preigom.setCurrencySign12("currencySign12");
        preigom.setAmount12("amount12");
        preigom.setCurrency12("currency12");

        preigom.setCodImport13("codAmount13");
        preigom.setUbi13("ubi13");
        preigom.setAccode13("accode13");
        preigom.setCodInter13("codInter13");
        preigom.setCl13("cl13");
        preigom.setCurrencySign13("currencySign13");
        preigom.setAmount13("amount13");
        preigom.setCurrency13("currency13");

        preigom.setCodImport14("codAmount14");
        preigom.setUbi14("ubi14");
        preigom.setAccode14("accode14");
        preigom.setCodInter14("codInter14");
        preigom.setCl14("cl14");
        preigom.setCurrencySign14("currencySign14");
        preigom.setAmount14("amount14");
        preigom.setCurrency14("currency14");

        preigom.setCodImport15("codAmount15");
        preigom.setUbi15("ubi15");
        preigom.setAccode15("accode15");
        preigom.setCodInter15("codInter15");
        preigom.setCl15("cl15");
        preigom.setCurrencySign15("currencySign15");
        preigom.setAmount15("amount15");
        preigom.setCurrency15("currency15");

        preigom.setCodImport16("codAmount16");
        preigom.setUbi16("ubi16");
        preigom.setAccode16("accode16");
        preigom.setCodInter16("codInter16");
        preigom.setCl16("cl16");
        preigom.setCurrencySign16("currencySign16");
        preigom.setAmount16("amount16");
        preigom.setCurrency16("currency16");

        preigom.setCodImport17("codAmount17");
        preigom.setUbi17("ubi17");
        preigom.setAccode17("accode17");
        preigom.setCodInter17("codInter17");
        preigom.setCl17("cl17");
        preigom.setCurrencySign17("currencySign17");
        preigom.setAmount17("amount17");
        preigom.setCurrency17("currency17");

        return preigom;
    }

    private static Preigom InitializeDataWithReflection() throws NoSuchFieldException, IllegalAccessException {
        Preigom preigom = new Preigom();
        Class<?> preigomClass = preigom.getClass();
        preigom.setName("Object with Reflection");
        for (int i = 1; i <= 17; i++) {
            Field codImportfield = preigomClass.getDeclaredField("codImport" + i);
            codImportfield.setAccessible(true); //Allow access to the private field
            codImportfield.set(preigom, "codAmount1");

            //TODO HACER INICIALIZAR DATOS CON REFLECTION RESTO DE CAMPOS...

        }

        return preigom;
    }

    private static void PrintObjectWithoutReflection(Preigom preigom) {

        System.out.println(preigom.getName());

        System.out.println("--- OBJECT 1 ---");
        System.out.println("AmountCod1" + " -> " + preigom.getCodImport1());
        System.out.println("Ubi1" + " -> " + preigom.getUbi1());
        System.out.println("Accode1" + " -> " + preigom.getAccode1());
        System.out.println("CodInter1" + " -> " + preigom.getCodInter1());
        System.out.println("Cl1" + " -> " + preigom.getCl1());
        System.out.println("currencySign1" + " -> " + preigom.getCurrencySign1());
        System.out.println("Amount1" + " -> " + preigom.getAmount1());
        System.out.println("Currency1" + " -> " + preigom.getCurrency1());
        System.out.println("----------------");

        System.out.println("--- OBJECT 2 ---");
        System.out.println("AmountCod2" + " -> " + preigom.getCodImport2());
        System.out.println("Ubi2" + " -> " + preigom.getUbi2());
        System.out.println("Accode2" + " -> " + preigom.getAccode2());
        System.out.println("CodInter2" + " -> " + preigom.getCodInter2());
        System.out.println("Cl2" + " -> " + preigom.getCl2());
        System.out.println("currencySign2" + " -> " + preigom.getCurrencySign2());
        System.out.println("Amount2" + " -> " + preigom.getAmount2());
        System.out.println("Currency2" + " -> " + preigom.getCurrency2());
        System.out.println("----------------");

        System.out.println("--- OBJECT 3 ---");
        System.out.println("AmountCod3" + " -> " + preigom.getCodImport3());
        System.out.println("Ubi3" + " -> " + preigom.getUbi3());
        System.out.println("Accode3" + " -> " + preigom.getAccode3());
        System.out.println("CodInter3" + " -> " + preigom.getCodInter3());
        System.out.println("Cl3" + " -> " + preigom.getCl3());
        System.out.println("currencySign3" + " -> " + preigom.getCurrencySign3());
        System.out.println("Amount3" + " -> " + preigom.getAmount3());
        System.out.println("Currency3" + " -> " + preigom.getCurrency3());
        System.out.println("----------------");

        System.out.println("--- OBJECT 4 ---");
        System.out.println("AmountCod4" + " -> " + preigom.getCodImport4());
        System.out.println("Ubi4" + " -> " + preigom.getUbi4());
        System.out.println("Accode4" + " -> " + preigom.getAccode4());
        System.out.println("CodInter4" + " -> " + preigom.getCodInter4());
        System.out.println("Cl4" + " -> " + preigom.getCl4());
        System.out.println("currencySign4" + " -> " + preigom.getCurrencySign4());
        System.out.println("Amount4" + " -> " + preigom.getAmount4());
        System.out.println("Currency4" + " -> " + preigom.getCurrency4());
        System.out.println("----------------");

        System.out.println("--- OBJECT 5 ---");
        System.out.println("AmountCod5" + " -> " + preigom.getCodImport5());
        System.out.println("Ubi5" + " -> " + preigom.getUbi5());
        System.out.println("Accode5" + " -> " + preigom.getAccode5());
        System.out.println("CodInter5" + " -> " + preigom.getCodInter5());
        System.out.println("Cl5" + " -> " + preigom.getCl5());
        System.out.println("currencySign5" + " -> " + preigom.getCurrencySign5());
        System.out.println("Amount5" + " -> " + preigom.getAmount5());
        System.out.println("Currency5" + " -> " + preigom.getCurrency5());
        System.out.println("----------------");

        System.out.println("--- OBJECT 6 ---");
        System.out.println("AmountCod6" + " -> " + preigom.getCodImport6());
        System.out.println("Ubi6" + " -> " + preigom.getUbi6());
        System.out.println("Accode6" + " -> " + preigom.getAccode6());
        System.out.println("CodInter6" + " -> " + preigom.getCodInter6());
        System.out.println("Cl6" + " -> " + preigom.getCl6());
        System.out.println("currencySign6" + " -> " + preigom.getCurrencySign6());
        System.out.println("Amount6" + " -> " + preigom.getAmount6());
        System.out.println("Currency6" + " -> " + preigom.getCurrency6());
        System.out.println("----------------");

        System.out.println("--- OBJECT 7 ---");
        System.out.println("AmountCod7" + " -> " + preigom.getCodImport7());
        System.out.println("Ubi7" + " -> " + preigom.getUbi7());
        System.out.println("Accode7" + " -> " + preigom.getAccode7());
        System.out.println("CodInter7" + " -> " + preigom.getCodInter7());
        System.out.println("Cl7" + " -> " + preigom.getCl7());
        System.out.println("currencySign7" + " -> " + preigom.getCurrencySign7());
        System.out.println("Amount7" + " -> " + preigom.getAmount7());
        System.out.println("Currency7" + " -> " + preigom.getCurrency7());
        System.out.println("----------------");

        System.out.println("--- OBJECT 8 ---");
        System.out.println("AmountCod8" + " -> " + preigom.getCodImport8());
        System.out.println("Ubi8" + " -> " + preigom.getUbi8());
        System.out.println("Accode8" + " -> " + preigom.getAccode8());
        System.out.println("CodInter8" + " -> " + preigom.getCodInter8());
        System.out.println("Cl8" + " -> " + preigom.getCl8());
        System.out.println("currencySign8" + " -> " + preigom.getCurrencySign8());
        System.out.println("Amount8" + " -> " + preigom.getAmount8());
        System.out.println("Currency8" + " -> " + preigom.getCurrency8());
        System.out.println("----------------");

        System.out.println("--- OBJECT 9 ---");
        System.out.println("AmountCod9" + " -> " + preigom.getCodImport9());
        System.out.println("Ubi9" + " -> " + preigom.getUbi9());
        System.out.println("Accode9" + " -> " + preigom.getAccode9());
        System.out.println("CodInter9" + " -> " + preigom.getCodInter9());
        System.out.println("Cl9" + " -> " + preigom.getCl9());
        System.out.println("currencySign9" + " -> " + preigom.getCurrencySign9());
        System.out.println("Amount9" + " -> " + preigom.getAmount9());
        System.out.println("Currency9" + " -> " + preigom.getCurrency9());
        System.out.println("----------------");

        System.out.println("--- OBJECT 10 ---");
        System.out.println("AmountCod10" + " -> " + preigom.getCodImport10());
        System.out.println("Ubi10" + " -> " + preigom.getUbi10());
        System.out.println("Accode10" + " -> " + preigom.getAccode10());
        System.out.println("CodInter10" + " -> " + preigom.getCodInter10());
        System.out.println("Cl10" + " -> " + preigom.getCl10());
        System.out.println("currencySign10" + " -> " + preigom.getCurrencySign10());
        System.out.println("Amount10" + " -> " + preigom.getAmount10());
        System.out.println("Currency10" + " -> " + preigom.getCurrency10());
        System.out.println("----------------");

        System.out.println("--- OBJECT 11 ---");
        System.out.println("AmountCod11" + " -> " + preigom.getCodImport11());
        System.out.println("Ubi11" + " -> " + preigom.getUbi11());
        System.out.println("Accode11" + " -> " + preigom.getAccode11());
        System.out.println("CodInter11" + " -> " + preigom.getCodInter11());
        System.out.println("Cl11" + " -> " + preigom.getCl11());
        System.out.println("currencySign11" + " -> " + preigom.getCurrencySign11());
        System.out.println("Amount11" + " -> " + preigom.getAmount11());
        System.out.println("Currency11" + " -> " + preigom.getCurrency11());
        System.out.println("----------------");

        System.out.println("--- OBJECT 12 ---");
        System.out.println("AmountCod12" + " -> " + preigom.getCodImport12());
        System.out.println("Ubi12" + " -> " + preigom.getUbi12());
        System.out.println("Accode12" + " -> " + preigom.getAccode12());
        System.out.println("CodInter12" + " -> " + preigom.getCodInter12());
        System.out.println("Cl12" + " -> " + preigom.getCl12());
        System.out.println("currencySign12" + " -> " + preigom.getCurrencySign12());
        System.out.println("Amount12" + " -> " + preigom.getAmount12());
        System.out.println("Currency12" + " -> " + preigom.getCurrency12());
        System.out.println("----------------");

        System.out.println("--- OBJECT 13 ---");
        System.out.println("AmountCod13" + " -> " + preigom.getCodImport13());
        System.out.println("Ubi13" + " -> " + preigom.getUbi13());
        System.out.println("Accode13" + " -> " + preigom.getAccode13());
        System.out.println("CodInter13" + " -> " + preigom.getCodInter13());
        System.out.println("Cl13" + " -> " + preigom.getCl13());
        System.out.println("currencySign13" + " -> " + preigom.getCurrencySign13());
        System.out.println("Amount13" + " -> " + preigom.getAmount13());
        System.out.println("Currency13" + " -> " + preigom.getCurrency13());
        System.out.println("----------------");

        System.out.println("--- OBJECT 14 ---");
        System.out.println("AmountCod14" + " -> " + preigom.getCodImport14());
        System.out.println("Ubi14" + " -> " + preigom.getUbi14());
        System.out.println("Accode14" + " -> " + preigom.getAccode14());
        System.out.println("CodInter14" + " -> " + preigom.getCodInter14());
        System.out.println("Cl14" + " -> " + preigom.getCl14());
        System.out.println("currencySign14" + " -> " + preigom.getCurrencySign14());
        System.out.println("Amount14" + " -> " + preigom.getAmount14());
        System.out.println("Currency14" + " -> " + preigom.getCurrency14());
        System.out.println("----------------");

        System.out.println("--- OBJECT 15 ---");
        System.out.println("AmountCod15" + " -> " + preigom.getCodImport15());
        System.out.println("Ubi15" + " -> " + preigom.getUbi15());
        System.out.println("Accode15" + " -> " + preigom.getAccode15());
        System.out.println("CodInter15" + " -> " + preigom.getCodInter15());
        System.out.println("Cl15" + " -> " + preigom.getCl15());
        System.out.println("currencySign15" + " -> " + preigom.getCurrencySign15());
        System.out.println("Amount15" + " -> " + preigom.getAmount15());
        System.out.println("Currency15" + " -> " + preigom.getCurrency15());
        System.out.println("----------------");

        System.out.println("--- OBJECT 16 ---");
        System.out.println("AmountCod16" + " -> " + preigom.getCodImport16());
        System.out.println("Ubi16" + " -> " + preigom.getUbi16());
        System.out.println("Accode16" + " -> " + preigom.getAccode16());
        System.out.println("CodInter16" + " -> " + preigom.getCodInter16());
        System.out.println("Cl16" + " -> " + preigom.getCl16());
        System.out.println("currencySign16" + " -> " + preigom.getCurrencySign16());
        System.out.println("Amount16" + " -> " + preigom.getAmount16());
        System.out.println("Currency16" + " -> " + preigom.getCurrency16());
        System.out.println("----------------");

        System.out.println("--- OBJECT 17 ---");
        System.out.println("AmountCod17" + " -> " + preigom.getCodImport17());
        System.out.println("Ubi17" + " -> " + preigom.getUbi17());
        System.out.println("Accode17" + " -> " + preigom.getAccode17());
        System.out.println("CodInter17" + " -> " + preigom.getCodInter17());
        System.out.println("Cl17" + " -> " + preigom.getCl17());
        System.out.println("currencySign17" + " -> " + preigom.getCurrencySign17());
        System.out.println("Amount17" + " -> " + preigom.getAmount17());
        System.out.println("Currency17" + " -> " + preigom.getCurrency17());
        System.out.println("----------------");
    }

    private static void PrintObjectWithReflection(Preigom preigom) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(preigom.getName());
        Class<?> preigomClass = preigom.getClass();
        for (int i = 1; i <= 17; i++) {

            System.out.println("---OBJECT "+ i +" ---");
            Field amountCodField = preigomClass.getDeclaredField("codImport" + i);
            amountCodField.setAccessible(true); // Allow access to the private field
            String amountCod = (String) amountCodField.get(preigom);
            System.out.println("AmountCod" + i + " -> " + amountCod);

            Field ubiField = preigomClass.getDeclaredField("ubi" + i);
            ubiField.setAccessible(true); // Allow access to the private field
            String ubi = (String) ubiField.get(preigom);
            System.out.println("Ubi" + i + " -> " + ubi);

            Field accodeField = preigomClass.getDeclaredField("accode" + i);
            accodeField.setAccessible(true); // Allow access to the private field
            String accode = (String) accodeField.get(preigom);
            System.out.println("Accode" + i + " -> " + accode);

            Field codInterField = preigomClass.getDeclaredField("codInter" + i);
            codInterField.setAccessible(true); // Allow access to the private field
            String codInter = (String) codInterField.get(preigom);
            System.out.println("CodInter" + i + " -> " + codInter);

            Field clField = preigomClass.getDeclaredField("cl" + i);
            clField.setAccessible(true); // Allow access to the private field
            String cl = (String) clField.get(preigom);
            System.out.println("Cl" + i + " -> " + cl);

            Field currencySignField = preigomClass.getDeclaredField("currencySign" + i);
            currencySignField.setAccessible(true); // Allow access to the private field
            String currencySign = (String) currencySignField.get(preigom);
            System.out.println("CurrencySign" + i + " -> " + currencySign);

            Field amountField = preigomClass.getDeclaredField("amount" + i);
            amountField.setAccessible(true); // Allow access to the private field
            String amount = (String) amountField.get(preigom);
            System.out.println("Amount" + i + " -> " + amount);

            Field currencyField = preigomClass.getDeclaredField("currency" + i);
            currencyField.setAccessible(true); // Allow access to the private field
            String currency = (String) currencyField.get(preigom);
            System.out.println("Currency" + i + " -> " + currency);
            System.out.println("----------------");
        }
    }

}