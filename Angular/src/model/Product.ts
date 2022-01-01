export class Product {
    productName: String = "";
    productId:number=0;
    createdDate: String = new Date().toISOString().substring(0, 10);
    billingList:any=[{}]
}