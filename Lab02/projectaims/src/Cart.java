public class Cart {
    private static final int MAX_NUMBER_ORDER =20; 
    private int qtyOrder=0;
    private DigitalVideoDisc listOfProduct[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
    public boolean check(String title){
          for(DigitalVideoDisc dvd:listOfProduct){
            if(dvd != null && dvd.getTitle()==title) return false;
          }
          return true;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(qtyOrder==MAX_NUMBER_ORDER){
            System.out.println("This cart has been full");
        }else{
            if(check(dvd.getTitle())){
                listOfProduct[qtyOrder]=dvd;
                qtyOrder++;  
            }else{
                System.out.println("This dvd has been existed");
            }
        }
    }
    public void removeDVD(DigitalVideoDisc dvd){
        if(listOfProduct.length==0){
            System.out.println("there is no product here");
        }else{
            if(check(dvd.getTitle())){
                System.out.println("there is no product like this");
                
            }else{
                DigitalVideoDisc listOfProduct2[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
                int index=0;
                for(DigitalVideoDisc dvdSub:listOfProduct){
                      if(dvdSub!=dvd){
                           listOfProduct2[index]=dvdSub; 
                           index++;
                      }
                }
                qtyOrder--;
                listOfProduct=listOfProduct2;
            }
        }
    }
    public float totalCost(){
        float totalCost=0;
        for(DigitalVideoDisc dvd:listOfProduct){
            if(dvd!=null){
                totalCost+=dvd.getCost();
            }
        }
        return totalCost;
    }
    public void list(){
        for(DigitalVideoDisc dvd:listOfProduct){
            if(dvd!=null){
                System.out.printf("%20s %20s %20s %.2f %.2f\n",dvd.getTitle(), dvd.getCategory(),dvd.getDirector(),dvd.getCost(),dvd.getLength());
            }
        }
    }
    
}
