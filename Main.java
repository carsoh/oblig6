public class Main {

    public static void main(String[] args) {
	Personer[] p = new Personer[10];
	Legemiddler[] lm = new Legemiddler[10];
	Leger[] l = new Leger[10];
	Resepter[] r = new Resepter[10];


	p[0] = new Personer(0,"Jens Olsen",1122148,"Veigata 9", 4523);
	p[1] = new Personer(1,"Sven Sevendsen",101512325,"Storgata 91",1028);
	
	lm[0] = new Legemiddler("Paralgin Forte", 0,65,400);

	l[0] = new Leger("Dr. Dre");

	r[0] = new Resepter(lm[0],l[0],p[0],1, 4,0);
	r[1] = new Resepter(lm[0],l[0],p[0],2, 4,1);
	r[2] = new Resepter(lm[0],l[0],p[0],3, 4,2);
	r[3] = new Resepter(lm[0],l[0],p[0],4, 4,3);

	
	EldsteForstResptListe liste = new EldsteForstResptListe();
	YngsteForstResptListe liste2 = new YngsteForstResptListe();

	YngsteForstResptListe liste3 = new YngsteForstResptListe();

	liste.finn(2);//letter paa en tom liste


	//setter inn noen resepter
	liste.settInn(r[0]);
	liste.settInn(r[1]);
	liste.settInn(r[2]);
	liste.settInn(r[3]);
	liste.settInn(r[3]);

	liste2.settInn(r[0]);
	liste2.settInn(r[1]);
	liste2.settInn(r[2]);
	liste2.settInn(r[3]);
	liste2.settInn(r[3]);

	System.out.println(liste.finn(2).getPris());//letter etter en resept

	System.out.println(".................");

	
	for(Resepter rrr : liste){
		System.out.println(rrr.getPris());
		}

	for(Resepter rr : liste2){
		System.out.println(rr.getPris());
		}
	//skirver ut listene

    }
}


