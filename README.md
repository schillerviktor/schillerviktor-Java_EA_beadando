#Java_EA_beadando

1.	Adatbázis menü: egy CRUD alkalmazás a választott adatbázissal				
Olvas almenü: Megjeleníti az adatbázis adatait egy táblázatban. Az adatbázis legalább 3 táblájának adatait használja fel. Ha túl sok adatot tartalmaz az adatbázis, akkor elég csak egy részét megjeleníteni.
Olvas2 almenü: Hasonló mint az előző, de az oldalon először jelenjen meg egy Űrlap, aminek segítségével tud szűrni az adatbázis adataira. Az űrlapon használja a következő elemeket: szöveges beviteli mező, lenyíló lista, radio gomb, jelölőnégyzet.
Ír almenü: Az oldalon jelenjen meg egy űrlap, aminek segítségével új rekordot tud hozzáfűzni az adatbázis egyik táblájához.
Módosít almenü: Az oldalon jelenjen meg egy űrlap, aminek segítségével egy már meglévő rekordot tud módosítani az adatbázis egyik táblájánál. A rekord azonosítója lenyíló listából legyen választható.
Töröl almenü: Az egyik tábla egy rekordjának törléséhez. A rekord azonosítója lenyíló listából legyen választható.


2.	Rest1 menü: Készítsen egy Restful klienst az eladáson bemutatott 			
https://gorest.co.in Rest szerverhez. A Create, Read, Update, Delete almenükben valósítsa meg a hozzájuk tartozó műveletet.


3.	SoapKliens menü: Készítsen egy SOAP klienst a Magyar Nemzeti Bank 		
webszolgáltatásához. 
Letöltés almenü: Letölti az összes adatot helyi adatbázisba.
Letöltés2 almenü: Az oldalon megjelenik egy űrlap (pl. beviteli mezők, lenyíló lista, radio gomb, jelölő négyzet). Letölti a kiválasztott adatokat helyi adatbázisba.
Grafikon almenü: Letöltés2 almenühöz hasonlóan választ egy adatsort és megjeleníti az adatokat grafikonon is.
Minta: https://www.mnb.hu/arfolyam-lekerdezes 


4.	Adatbányászat menü: 									
Válasszanak ki egy fájlt az Adatbányászat-források mappából (az órán vizsgát credit-g.arff fájlt nem lehet választani). Válasszanak ki ebben egy olyan attribútumot, ami nem sok fajta adatot tartalmaz. Általában az utolsó Class nevű attribútum ilyen. 
Döntési fa almenü: Készítsenek döntési fával gépi tanuló algoritmus a kiválasztott attribútum előrejelzésére. Eredményül írassák ki a Döntési fa.txt fájlba a következő adatokat: 
Tanító és kiértékelő halmaz mérete, 
TP, TN, FP, FN, Correctly Classified Instances, Incorrectly Classified Instances
A döntési fa kiíratása
A kiértékelő halmaz minden egyedére a prediktált és a valós érték
Több algoritmus almenü: A választott adathalmazra futtassa le a tanult algoritmusokat. A Gépi tanulás.txt fájlba írassa ki mindegyikre: 
TP, TN, FP, FN, Correctly Classified Instances, Incorrectly Classified Instances
Válassza ki az algoritmusok közül azt, amelyiknek a legjobb lett a Correctly Classified Instances eredménye és írassa ki az algoritmus nevét az alkalmazás ablakába.
Több algoritmus almenü-2: Lenyíló listából lehessen választani a tanult algoritmusok közül. Az algoritmust lefuttatva írassa ki az alkalmazás ablakába a következő adatokat:
TP, TN, FP, FN, Correctly Classified Instances, Incorrectly Classified Instances


5.	Egyéb menü:											
Páthuzamos almenü: Mutassa be a párhuzamos programvégrehajtást egy oldalon. pl. egy gombra való kattintás után egy Label-ben 1 másodpercenként, a másik Labelbe 2 másodpercenként jelenjen meg egy változó szöveg.
Stream almenü: Olvassa ki a válsztott adatbázis minden adatát egy Stream-be. Késztsen egy űrlapot (beviteli mezők, lenyíló lista, radio gomb, jelölő négyzet), ahol több szűrőfeltételt is beállíthat az adatokra. Jelenítse meg egy táblázatban a szűrt adatokat.


6.	Forex menü: az Oanda API segítségével							
Számlainformációk almenü: Írassa ki a számlainformációkat egy táblázatba
Aktuális árak almenü: Lenyíló listából lehessen választani devizapárt. Írassa ki az aktuális árat, amit 1mp-enként frissít
Historikus árak almenü: Lenyíló listákból lehessen választani devizapárt, kezdő és záró dátumot. Egy táblázatba kiíratja a két dátum közötti árakat, amiket grafikonon is ábrázol.
Pozíció nyitás almenü: Lenyíló listákból lehessen választani devizapárt, mennyiséget és irányt (vétel, eladás) és megnyitja a pozíciót.
Pozíció zárás almenü: Beviteli mezőben meg lehet adni a pozíció ID-ját. Zárja az adott pozíciót.
Nyitott pozíciók almenü: Kiírja egy táblázatba a nyitott pozíciókat. 			


7.	Használják a GitHub (github.com) verziókövető rendszert. 			
(Kötelező elem! A forrás ez alapján lesz javítva) 
A GitHub-on a projektmunka módszert alkalmazzák: látszódjék, hogy a csoport tagjai melyik részt készítették el és kb. fele-fele arányban járuljanak hozzá a projekthez. Ne csak a kész alkalmazást töltsék fel egy lépésben, hanem a részállapotokat is még legalább 5 lépésben személyenként.
A Git-es projektmunka használata nem kötelező, de ha nem így oldják meg, akkor az 3 pont levonással jár.
A GIT-en a főmappában jelenjen meg a választott adatbázis export fájlja (adatbazis.sql).
A GIT-en saját nevet válasszanak, ami alapján be lehet azonosítani, hogy ki mit töltött fel.


8.	Készítsen egy JAR futtatható fájlt, ami a GitHub-on is megjelenik a főmappában. 	
(Kötelező elem! a működés ez alapján lesz javítva)  
Az adatbázisfájlt is ide tegye adatok.db néven.
A kipróbáláshoz csak ezt a JAR fájlt és az adatbázisfájlt töltöm le a GitHub-ról. Működnie kell a XAMPP nélkül is. Az adatbázisfájlt a c:\adatbazis mappába kelljen másolni. Lehet több adatbázisfájlt is használni.



![Java_EA_promo_](https://github.com/schillerviktor/schillerviktor-Java_EA_beadando/assets/46298416/1acb953a-1e25-40a9-91dd-4edaa64dccc7)
