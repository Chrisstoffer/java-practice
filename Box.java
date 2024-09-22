public class Box {
    //সুপারক্লাসের নিজস্ব ডাটা
    double width;
    double height;
    double depth;
//কপি কন্সট্রাক্টর , কারন আমরা একের অধিক অবজেক্ট নিয়ে কাজ করবো এবং
//ভবিষ্যতে যাতে সব গুলো অবজেক্টকে ইন্ডিপেন্ডেন্টলি ইনিশিয়ালাইজ করা যায়।
    Box (Box ob) 
    {
        width = ob.width;
        height = ob.height;
        depth  = ob.depth;
    }
    //কন্সট্রাক্টর ব্যাবহার করা হয়েছে যখন সকল ভ্যালু নির্দিষ্ট করে দেওইয়া হয় তার জন্য
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth  = d;
    }
    //যদি ইনিশিয়ালি কোনো ডেটা দেওয়া না থাকে
    Box()
    {
        width = -1;
        height = -1;
        depth  = -1;
    }
    //যদি একটা কিউব তৈরি করা হয় তখন ইনিশিয়ালাইজেশন,
    Box(double len)
    {
        width=height=depth=len; //ঘনকের সকল বাহু সমান তাই সবগুলো মান একই
    }
    //আয়তন বের করার জন্য মেথড
    double volume()
    {
        return width*height*depth;
    }
    
}
// বক্সের সাথে নতুন ক্লাস ইনহেরিটেট করানোর জন্য নতুন ক্লাস 
class boxweith extends Box
{
double weight;  //নতুন ক্লাসের নিজস্ব প্যারামিটার

//নতুন ক্লাসের কন্সট্রাক্টর, প্যারামিটার ইনিশিয়ালাইজ করার জন্য 
boxweith(double w, double h, double d,double m)
{
    width = w;
    height = h;
    depth = d;
    weight = m;
}
}

//মেইন ড্রাইভার ক্লাস 
class finalBoxweight 
{
    //মেইন মেথড 
    public static void main(String[] args) {
    boxweith box1 = new boxweith(10, 20, 15, 34.3);     //প্রি ডিফাইন্ড ভ্যালু , মেথডের মধ্যে পাস করা হচ্ছে অবজেক্টের সাহায্যে
    boxweith box2 = new boxweith(2, 3, 4, 0.076);

    double vol;

    vol=box1.volume();          //আয়তন 
    System.out.println("Voliume of Box 1 is: "+vol);
    System.out.println("Weight of box one is: "+box1.weight);
    System.out.println();

    vol = box2.volume();
    System.out.println("Voliume of Box 2 is: "+vol);
    System.out.println("Weight of box 2 is: "+box2.weight);
    //
}

}


