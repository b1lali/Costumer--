public class DateBase {
    Costumer [] costumers;
    public DateBase(Costumer[] costumers) {
        this.costumers=costumers;
    }


    public  void updateCostumerName(String name,String newName) {
        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getName().equals(name)) {
                costumers[i].setName(newName);
                System.out.println(costumers[i].getName());
            }
        }
    }
    public String payment(String name, int password,int sum){
        for (int i = 0; i <costumers.length ; i++) {
            if (costumers[i].getBank().getUserName().equals(name)){
                if (costumers[i].getBank().getPassword()==password){
                    if (sum<=costumers[i].getBank().getTotalMoney()){
                        return "Sizdin balansynyz "+(costumers[i].getBank().getTotalMoney()-sum+" kaldy...");
                    }else {
                        return "Sizdin akchanyz jetishsiz";
                    }
                }
            }
        }
        return "Koldonuuchunun aty tuura emes je shot tuura emes";

    }

}


