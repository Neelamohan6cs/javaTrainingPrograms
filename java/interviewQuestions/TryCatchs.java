class TryCatchs {
    public static void main(String args[]){
        try{
            for(int i =0 ;i<100;i++){
                if(i==10){
                    throw new Exception("10 Found in the loop");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This will always execute");
        }
    }
    
}


//and strickly follow the  left side frontend and center aws and clowd and right side backend , this must follow this struct in pc view and mobile view , give animation above like data travel frontedn to backnd , atravtive

