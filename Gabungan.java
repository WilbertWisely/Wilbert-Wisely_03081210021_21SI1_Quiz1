import java.util.Scanner;

public class Gabungan {
    
    public static void main(String[]args) throws Exception{
        int pil,s=0;
        double i;
        float p,l,t,a,b;
        Scanner temp = new Scanner (System.in);
        setget sg = new setget();
        do
        {
            System.out.println("Silahkan pilih salah satu fungsi di bawah ini ");
            System.out.println("1. Hitung volume kubus ");
            System.out.println("2. Hitung volume tabung ");
            System.out.println("3. Hitung volume balok ");
            System.out.println("4. Hitung volume prisma segitiga ");
            System.out.println("5. Hitung volume limas segitiga ");
            System.out.println("6. Keluar ");
            System.out.println("Masukkan pilihan anda : ");
            pil = temp.nextInt();
            switch (pil)
            {
                case 1 :

                System.out.println("Masukkan panjang sisi = ");
                s= temp.nextInt();
                double volume = s*s*s;
                System.out.println("Volume Kubus = " +volume+ "cm");
                for (i=1;i<=volume;i++)
                {
                    if(i%2==0)
                    {
                        System.out.print(""+i+"");
                    }
                }
                    break;

                case 2 :
                int r=0;
                double PI = 22.0/7;
                System.out.println("Masukkan Panjang jari-jari (r) : ");
                r=temp.nextInt();
                System.out.println("Masukkan Tinggi(t) : ");
                t=temp.nextInt();
                double v = PI*r*r*t;
                System.out.println("Luas Tabung = "+ v);
                for (i=1;i<=v;i++)
                {
                    if(i%2==0)
                    {
                        System.out.print(""+i+"");
                    }
                }
                    break;

                 case 3 :
                    System.out.println("Masukkan Panjang  : ");
                    p=temp.nextInt();
                    System.out.print("Masukkan Lebar : ");
                    l=temp.nextInt();
                    System.out.print("Masukkan Tinggi : ");
                    t=temp.nextInt();
                    double volum = p*l*t;
                    System.out.println("Luas Tabung = "+ volum);
                    for (i=1;i<=volum;i++)
                    {
                        if(i%2==0)
                        {
                            System.out.print(""+i+"");
                        }
                    }
                        break;
                case 4 :
                    System.out.println("Masukkan alas pertama  : ");
                    a=temp.nextInt();
                    System.out.print("Masukkan alas kedua : ");
                    b=temp.nextInt();
                    System.out.print("Masukkan Tinggi : ");
                    t=temp.nextInt();
                    float volu = a*b*t*1/2;
                    System.out.println("Luas Tabung = "+ volu);
                    for (i=1;i<=volu;i++)
                    {
                        if(i%2==0)
                        {
                            System.out.print(""+i+"");
                        }
                    }
                        break;
                case 5 :
                System.out.print("Masukkan panjang limas : ");
                sg.setp(temp.nextFloat()) ;
                System.out.print("\nMasukkan lebar limas : ");
                sg.setl(temp.nextFloat());
                System.out.print("\nMasukkan tinggi limas : ");
                sg.sett(temp.nextFloat()) ;
                float v1=sg.luaslimas();
                System.out.print("\nVolume limas segi empat adalah : "+v1);
                for (i=1;i<=v1;i++)
                {
                    if(i%2==0)
                    {
                        System.out.print("Bilangan genap = "+i+"");
                    }
                }
                temp.close();
                break;
                
            case 6:
            break;
            }
            System.out.print("\n");
        }while (pil!=6);
        
    }
    
}