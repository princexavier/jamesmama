export class Model { 



       customerName:String="";
       productName:String="";

       customerGroup:String="";
        amount:number=0;
        quantity:number=0;

        createdDate :String=new Date().toISOString().substring(0, 10);
    
}