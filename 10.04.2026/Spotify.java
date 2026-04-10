import java.util.Scanner;
class Spotify
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
   
    System.out.println("********* Spotify**********");
    System.out.println("1.A.R. RAHMAN");
    System.out.println("2.ANIRUDH");
    System.out.println("3.HARISH JEYARAJ");
    System.out.println("4.ILLAIYARAJA ");
	System.out.println("5.U1");
    System.out.print("CHOOSE YOUR FAVOURITE MUSIC ARTIST : ");	
	int artist=sc.nextInt();
	if(artist==1)
	{
		System.out.println("1.MELODY");
		System.out.println("2.KUTHU");
		System.out.println("3.MOTIVATIONAL SONG");
		System.out.println("4.SAD");
		System.out.print("CHOOSE ANY ONE GENRE :");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Netru illadha Matram");
			System.out.println("Enna Solla Pogirai");
			System.out.println("Ennavale Adi Ennavale");
			System.out.println("Malargale Malargale");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Netru illadha Matram");}
			else if (choice == 2){System.out.println("Enna Solla Pogirai");}
			else if (choice == 3){System.out.println("Ennavale Adi Ennavale");}
			else if (choice == 4){System.out.println("Malargale Malargale");}
			else {System.out.println("That's it");}
			
			
		}
		else if(option==2)
		{
			System.out.println("Thaiya Thaiya");
			System.out.println("Mukkala Mukkabala");
			System.out.println("Urvashi Urvashi");
			System.out.println(" Aathichudi");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Thaiya Thaiya");}
			else if (choice == 2){System.out.println("Mukkala Mukkabala");}
			else if (choice == 3){System.out.println("Urvashi Urvashi");}
			else if (choice == 4){System.out.println("Aathichudi");}
			else {System.out.println("That's it");}
			
		}
		else if(option==3)
		{
			System.out.println("Vande Mataram");
			System.out.println("Oruvan Oruvan mudhalli");
			System.out.println("Shakthi kodu");
			System.out.println("Kappal Yeari Poyachu");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Vande Mataram");}
			else if (choice == 2){System.out.println("Oruvan Oruvan mudhalli");}
			else if (choice == 3){System.out.println("Shakthi kodu");}
			else if (choice == 4){System.out.println("Kappal Yeari Poyachu");}
			else {System.out.println("That's it");}
		}
		
		else if (option == 4)
		{
			System.out.println("Poongatrile");
			System.out.println("Marudaani");
			System.out.println("Minnalea En vazhvin");
			System.out.println("Rasathi");
			System.out.println("Oru poiyavathu Sol");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Poongatrile");}
			else if (choice == 2){System.out.println("Marudaani");}
			else if (choice == 3){System.out.println("Minnalea En vazhvin");}
			else if (choice == 4){System.out.println("Rasathi");}
			else if (choice == 5){System.out.println("Oru poiyavathu Sol");}
			else {System.out.println("That's it");}
			
		}
		
		else {
			
			System.out.println("Over");
			
		}
	}
	else if(artist==2)
	{
		System.out.println("1.MELODY");
		System.out.println("2.KUTHU");
		System.out.println("3.MOTIVATIONAL SONG");
		System.out.println("4.SAD");
		System.out.print("CHOOSE ANY ONE GENRE :");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Neeyum Nanum Anbe");
			System.out.println("Velicha Poove");
			System.out.println("Po Indru Neeyaga");
			System.out.println(" Nee partha vizhigal");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Neeyum Nanum Anbe");}
			else if (choice == 2){System.out.println("Velicha Poove");}
			else if (choice == 3){System.out.println("Po Indru Neeyaga");}
			else if (choice == 4){System.out.println("Nee partha vizhigal");}
			
			else {System.out.println("That's it");}
			
		}
		else if(option==2)
		{
			System.out.println("Vaathi Raid");
			System.out.println(" Naa Ready");
			System.out.println("Badass");
			System.out.println(" Vandha Edam");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Vaathi Raid");}
			else if (choice == 2){System.out.println(" Naa Ready");}
			else if (choice == 3){System.out.println("Badass");}
			else if (choice == 4){System.out.println("Vandha Edam");}
			
			else {System.out.println("That's it");}
		}
		else if(option==3)
		{
			System.out.println("Velai Illa pattathari");
			System.out.println("Boomi Enna Suthudhe");
			System.out.println("Ethir Neechal");
			System.out.println("Surviva");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Velai Illa pattathari");}
			else if (choice == 2){System.out.println("Boomi Enna Suthudhe");}
			else if (choice == 3){System.out.println("Ethir Neechal");}
			else if (choice == 4){System.out.println("Surviva");}
			
			else {System.out.println("That's it");}
		}
		
		else if (option == 4)
		{
			System.out.println("Porkanda Singam");
			System.out.println("Kanave Kanave");
			System.out.println("Kannaana Kanne");
			System.out.println("Jodi Nilave");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Porkanda Singam");}
			else if (choice == 2){System.out.println("Kanave Kanave");}
			else if (choice == 3){System.out.println("Kannaana Kanne");}
			else if (choice == 4){System.out.println("Jodi Nilave");}
			
			else {System.out.println("That's it");}
			
			
		}
		
		else {
			
			System.out.println("Over");
			
		}
	}
	
	
	else if(artist==3)
	{
		System.out.println("1.MELODY");
		System.out.println("2.KUTHU");
		
		System.out.println("3.SAD");
		System.out.print("CHOOSE ANY ONE GENRE :");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Unnale");
			System.out.println("Annul Maele");
			System.out.println("Yedho Ondru");
			System.out.println(" Vaseegara");
			System.out.println("  Paartha Mudhal");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Unnale");}
			else if (choice == 2){System.out.println("Annul Maele");}
			else if (choice == 3){System.out.println("Yedho Ondru");}
			else if (choice == 4){System.out.println("Vaseegara");}
			else if (choice == 5){System.out.println("Paartha Mudhal");}
			else {System.out.println("That's it");}
			
		}
		else if(option==2)
		{
			System.out.println(" Tirunelveli Halwa Da");
			System.out.println(" Aradi katre");
			System.out.println(" Soda Bottle");
			System.out.println(" Aruva Meesai");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println(" Tirunelveli Halwa Da");}
			else if (choice == 2){System.out.println("Aradi katre");}
			else if (choice == 3){System.out.println("Soda Bottle");}
			else if (choice == 4){System.out.println(" Aruva Meesai");}
			
			else {System.out.println("That's it");}
		}
		else if(option==3)
		{
			System.out.println("Venmathiye");
			System.out.println("Oh maname");
			System.out.println("Yamma Yamma");
			System.out.println("Othayile");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Venmathiye");}
			else if (choice == 2){System.out.println("Oh maname");}
			else if (choice == 3){System.out.println("Yamma Yamma");}
			else if (choice == 4){System.out.println("Othayile");}
			
			else {System.out.println("That's it");}
		}
		
		
		
		else {
			
			System.out.println("Over");
			
		}
	}
	
	
	else if(artist==4)
	{
		System.out.println("1.MELODY");
		System.out.println("2.KUTHU");
		
		System.out.println("3.SAD");
		System.out.print("CHOOSE ANY ONE GENRE :");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Oru kili uruguthu");
			System.out.println("Kuzhaloodhum kannanukku");
			System.out.println("Ennai thottu");
			System.out.println(" Raja Raja cholan");
			
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Oru kili uruguthu");}
			else if (choice == 2){System.out.println("Kuzhaloodhum kannanukku");}
			else if (choice == 3){System.out.println("Ennai thottu");}
			else if (choice == 4){System.out.println("Raja Raja cholan");}
		
			else {System.out.println("That's it");}
			
			
		}
		else if(option==2)
		{
			System.out.println(" Ooruvittu ooruvanthu");
			System.out.println(" Nooru varusham");
			System.out.println("  Aasai Nooruvagai");
			System.out.println(" Aasai Athigam vachu");
			
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println(" Ooruvittu ooruvanthu");}
			else if (choice == 2){System.out.println("Nooru varusham");}
			else if (choice == 3){System.out.println("Aasai Nooruvagai");}
			else if (choice == 4){System.out.println(" Aasai Athigam vachu");}
			
			else {System.out.println("That's it");}
		}
		else if(option==3)
		{
			System.out.println("Kanne Kalaimane");
			System.out.println("Thene thenpaandi Neeye");
			System.out.println("Paadi Parantha Killi");
			System.out.println("Nilave Vaa");
			
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Poongatrile");}
			else if (choice == 2){System.out.println("Marudaani");}
			else if (choice == 3){System.out.println("Minnalea En vazhvin");}
			else if (choice == 4){System.out.println("Rasathi");}
			else if (choice == 4){System.out.println("Oru poiyavathu Sol");}
			else {System.out.println("That's it");}
		}
		
		
		
		else {
			
			System.out.println("Over");
			
		}
	}
	
	
	else if(artist==5)
	{
		System.out.println("1.MELODY");
		System.out.println("2.KUTHU");
		System.out.println("3.MOTIVATIONAL SONG");
		System.out.println("4.SAD");
		System.out.print("CHOOSE ANY ONE GENRE :");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Aathadi Manasudhan");
			System.out.println("Chinna sirisu");
			System.out.println("Venmeggam");
			System.out.println("Iayyayyo");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Aathadi Manasudhan");}
			else if (choice == 2){System.out.println("Chinna sirisu");}
			else if (choice == 3){System.out.println("Venmeggam");}
			else if (choice == 4){System.out.println("Iayyayyo");}
			
			else {System.out.println("That's it");}
			
		}
		else if(option==2)
		{
			System.out.println("Machi open the bottle");
			System.out.println(" Saroja saman nikalo");
			System.out.println("No money no honey");
			System.out.println(" Villaiyadu mankatha");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Machi open the bottle");}
			else if (choice == 2){System.out.println("Saroja saman nikalo");}
			else if (choice == 3){System.out.println("No money no honey");}
			else if (choice == 4){System.out.println("Rasathi");}
			else if (choice == 5){System.out.println(" Villaiyadu mankatha");}
			else {System.out.println("That's it");}
		}
		else if(option==3)
		{
			System.out.println("Edhirthu Nill");
			System.out.println("Oru nalil");

			System.out.println("Nimirnthu NIL");
			System.out.println("Ungakkule Mirugam");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Edhirthu Nill");}
			else if (choice == 2){System.out.println("Oru nalil");}
			else if (choice == 3){System.out.println("Nimirnthu NIL");}
			else if (choice == 4){System.out.println("Ungakkule Mirugam");}
			
			else {System.out.println("That's it");}
		}
		
		else if (option == 4)
		{
			System.out.println("Kadhal valarthen");
			System.out.println(" Yedho ondru ennai");
			System.out.println(" Pogadhe");
			System.out.println("Ninaithu ninaithu");
			System.out.print("Select the song = ");
			int choice =sc.nextInt();
			
			if(choice ==1){System.out.println("Kadhal valarthen");}
			else if (choice == 2){System.out.println("Yedho ondru ennai");}
			else if (choice == 3){System.out.println("Pogadhe");}
			else if (choice == 4){System.out.println("Ninaithu ninaithu");}
			
			else {System.out.println("That's it");}
			
			
		}
		
		else {
			
			System.out.println("Over");
			
		}
	}
	
	
	
	
	
	
	else
	{
			System.out.println("ONLY THESE SONGS ARE AVAILABLE ");
	}

	}

}