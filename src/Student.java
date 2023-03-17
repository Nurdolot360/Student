public class Student {
    private String name;
    private String serName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {

        return serName;
    }
    public void setSerName(String serName){
        this.serName = serName;
    }

    public void setSerName() {
       if (this.name.equals("Azamat")){
           System.out.println("Ticher name");
       }else
           System.out.println("studeent name");

    }
}