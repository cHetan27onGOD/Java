public class phraseOmatic{
    public static void main(String[] args)
    {
        String[] wordlistone={"24/7","Multi-teir","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive","dynamic"};

        String[] wordlisttwo={"empowered", "sticky", "value-added", "oriented", "centric","distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", 
        "targeted", "shared", "cooperative", "accelerated"};

        String[] wordlistthree={"mate","tul","hello"};

        int oneLength = wordlistone.length;
        int twoLength = wordlisttwo.length;
        int threeLength = wordlistthree.length;

        int rand1=(int)(Math.random()*oneLength);
        int rand2=(int)(Math.random()*twoLength);
        int rand3=(int)(Math.random()*threeLength);

        String phrase= wordlistone[rand1]+" "+wordlisttwo[rand2]+" "+wordlistthree[rand3] ;
        System.out.println("what we need is a"+" "+ phrase);


    }
}