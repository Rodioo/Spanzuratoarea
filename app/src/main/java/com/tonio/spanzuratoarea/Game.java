package com.tonio.spanzuratoarea;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;


public class Game extends AppCompatActivity {

    public static final Question[] animale = {
            new Question("ELEFANT", "ANIMAL MARE DIN SAVANA"),
            new Question("CAINE", "CEL MAI BUN PRIETEN"),
            new Question("PISICA", "CADE IN PICIOARE"),
            new Question("GIRAFA", "GAT LUNG"),
            new Question("CROCODIL", "REPTILA PICIOARE SCURTE"),
            new Question("ALIGATOR", "SEAMANA CU CROCODIL "),
            new Question("LEU", "REGELE JUNGLEI"),
            new Question("TIGRU", "BLANA FRUMOASA"),
            new Question("JAGUAR", "AL DOILEA CEL MAI RAPID"),
            new Question("GHEPARD", "CEL MAI RAPID"),
            new Question("HIPOPOTAM", "ANIMAL GRAS DIN SAVANA"),
            new Question("RINOCER", "ARE CORN"),
            new Question("VACA", "FACE LAPTE"),
            new Question("PORC", "SE TAIE DE CRACIUN"),
            new Question("MIEL", "SE TAIE DE PASTE"),
            new Question("GAINA", "FACE OUA"),
            new Question("VULPE", "E VICLEANA"),
            new Question("URS", "II PLACE MIEREA"),
            new Question("ALBINA", "FACE MIERE"),
            new Question("FURNICA", "INSECTA HARNICA"),
            new Question("FLUTURE", "INSECTA FRUMOASA"),
            new Question("LUP", "CAINE RAU"),
            new Question("PESTE", "STA IN APA"),
            new Question("RECHIN", "REGELE OCEANELOR"),
            new Question("COCOS", "CANTA DIMINEATA"),
            new Question("RATA", "MACANE"),
            new Question("SOARECE", "MANANCA BRANZA"),
            new Question("CAPRIOARA", "BAMBI"),
            new Question("RANDUNICA", "PASARE MIGRATOARE"),
            new Question("VRABIOARA", "PASARE MICA COMUNA"),
            new Question("CIOARA", "PASAREA NEAGRA"),
            new Question("TANTAR", "BEA SANGE"),
            new Question("CAL", "ESTE CALARIT"),
            new Question("IEPURE", "MANANCA MORCOVI"),
            new Question("LEBADA", "PASARE FRUMOASA ALBA"),
            new Question("OAIE", "ARE LANA"),
            new Question("PANDA", "MANANCA BAMBUS"),
            new Question("DELFIN", "ANIMAL INTELIGENT"),
            new Question("MAIMUTA", "MANANCA BANANA"),
            new Question("URS POLAR", "URS LA POLUL NORD"),
            new Question("CAMELEON", "SCHIMBA CULOAREA"),
            new Question("SARPE", "REPTILA VENINOASA"),
            new Question("PAIANJEN", "INSECTA VENINOASA"),
            new Question("CANGUR", "ARE MARSUPIU"),
            new Question("TESTOASA", "SE MISCA LENT"),
            new Question("SOPARLA", "ISI PIERDE COADA"),
            new Question("BROASCA", "PRINDE MUSTE CU LIMBA"),
            new Question("PAPAGAL", "PASARE COLORATA"),
            new Question("BUFNITA", "PASARE NOCTURNA"),
            new Question("VULTUR", "PASARE MARE"),
            new Question("EMU", "CEA MAI MARE PASARE"),
            new Question("FLAMINGO", "STA INTR-UN PICIOR"),




    };

    public static final Question[] fructeLegume = {
            new Question("MAR", "FRUCT COMUN"),
            new Question("BANANA", "FRUCTUL MAIMUTEI"),
            new Question("CAPSUNA", "FRUCT ROSU"),
            new Question("MANGO", "FRUCT EXOTIC"),
            new Question("ANANAS", "FRUCT EXOTIC"),
            new Question("CIREASA", "FRUCT ROSU SI MIC"),
            new Question("VISINA", "FRUCT VISINIU"),
            new Question("GUTUIE", "FRUCT DULCE-AMARUI"),
            new Question("PORTOCALA", "FRUCT-CULOARE"),
            new Question("PARA", "FRUCT DULCE"),
            new Question("LAMAIE", "FRUCT ACRU"),
            new Question("STRUGURI", "FRUCT ALB SAU NEGRU"),
            new Question("ZMEURA", "FRUCT MIC"),
            new Question("AVOCADO", "FRUCT EXOTIC"),
            new Question("MURE", "FRUCT MIC"),
            new Question("PEPENE ROSU", "FRUCT MARE"),
            new Question("PEPENE GALBEN", "FRUCT GALBEN"),
            new Question("AFINE", "FRUCT MOV"),
            new Question("ROSIE", "LEGUMA, DAR E FRUCT"),
            new Question("CASTRAVETE", "LEGUMA LUNGA VERDE"),
            new Question("CEAPA", "LEGUMA PLANGACIOASA"),
            new Question("CARTOF", "LEGUMA COMUNA"),
            new Question("ARDEI GRAS", "LEGUMA COMUNA"),
            new Question("ARDEI IUTE", "E PICANT"),
            new Question("MORCOV", "LEGUMA PORTOCALIE"),
            new Question("VARZA", "LEGUMA VERDE"),
            new Question("SALATA", "LEGUMA VERDE"),
            new Question("FASOLE", "BOABE"),
            new Question("MAZARE", "LEGUMA MICA VERDE"),
            new Question("USTUROI", "LEGUMA MICA ALBA"),
            new Question("VANATA", "LEGUMA MOV"),
            new Question("BROCCOLI", "LEGUMA VERDE"),
            new Question("DOVLEAC", "LEGUMA HALLOWEEN"),
            new Question("SPANAC", "LEGUMA VERDE"),
    };

    public static final Question[] tari = {
            new Question("ROMANIA", "EUROPA DE EST"),
            new Question("MOLDOVA", "EUROPA DE EST"),
            new Question("BULGARIA", "EUROPA DE SUD-EST"),
            new Question("GRECIA", "EUROPA DE SUD-EST"),
            new Question("RUSIA", "EUROPA DE EST"),
            new Question("UCRAINA", "EUROPA DE EST"),
            new Question("POLONIA", "EUROPA CENTRALA"),
            new Question("TURCIA", "EUROPA DE SUD-EST"),
            new Question("NORVEGIA", "EUROPA DE NORD"),
            new Question("SUEDIA", "EUROPA DE NORD"),
            new Question("DANEMARCA", "EUROPA DE NORD"),
            new Question("OLANDA", "EUROPA DE VEST"),
            new Question("GERMANIA", "EUROPA CENTRALA"),
            new Question("FRANTA", "EUROPA DE VEST"),
            new Question("BELGIA", "EUROPA DE VEST"),
            new Question("ELVETIA", "EUROPA CENTRALA"),
            new Question("AUSTRIA", "EUROPA CENTRALA"),
            new Question("CEHIA", "EUROPA CENTRALA"),
            new Question("UNGARIA", "EUROPA CENTRALA"),
            new Question("SERBIA", "EUROPA CENTRALA"),
            new Question("ITALIA", "EUROPA CENTRALA"),
            new Question("SPANIA", "EUROPA DE VEST"),
            new Question("ANGLIA", "EUROPA DE VEST"),
            new Question("PORTUGALIA", "EUROPA DE VEST"),
            new Question("FINLANDA", "EUROPA DE NORD"),
            new Question("LITUANIA", "EUROPA DE EST"),
            new Question("LETONIA", "EUROPA DE EST"),
            new Question("ESTONIA", "EUROPA DE EST"),
            new Question("AMERICA", "AMERICA DE NORD"),
            new Question("MEXIC", "AMERICA DE NORD"),
            new Question("CANADA", "AMERICA DE NORD"),
            new Question("JAMAICA", "AMERICA CENTRALA"),
            new Question("BRAZILIA", "AMERICA DE SUD"),
            new Question("ARGENTINA", "AMERICA DE SUD"),
            new Question("CHILE", "AMERICA DE SUD"),
            new Question("COLUMBIA", "AMERICA DE SUD"),
            new Question("PERU", "AMERICA DE SUD"),
            new Question("PARAGUAY", "AMERICA DE SUD"),
            new Question("VENEZUELA", "AMERICA DE SUD"),
            new Question("BOLIVIA", "AMERICA DE SUD"),
            new Question("NIGERIA", "AFRICA"),
            new Question("AFRICA DE SUD", "AFRICA"),
            new Question("COASTA DE FILDES", "AFRICA"),
            new Question("CAMERUN", "AFRICA"),
            new Question("CHAD", "AFRICA"),
            new Question("SOMALIA", "AFRICA"),
            new Question("CHINA", "ASIA"),
            new Question("INDIA", "ASIA"),
            new Question("JAPONIA", "ASIA"),
            new Question("MONGOLIA", "ASIA"),
            new Question("SYRIA", "ORIENTUL MIJLOCIU"),
            new Question("IRAN", "ORIENTUL MIJLOCIU"),
            new Question("IRAK", "ORIENTUL MIJLOCIU"),
            new Question("AFGHANISTAN", "ORIENTUL MIJLOCIU"),
            new Question("VIETNAM", "ASIA"),
            new Question("AUSTRALIA", "OCEANIA"),
            new Question("NOUA ZEELANDA", "OCEANIA"),
            new Question("COREEA DE SUD", "ASIA"),
            new Question("COREEA DE NORD", "ASIA"),
            new Question("EGIPT", "AFRICA"),
            new Question("URUGUAY", "AMERICA DE SUD"),
            new Question("ALGERIA", "AFRICA"),
            new Question("SUDAN", "AFRICA"),
            new Question("CONGO", "AFRICA"),
            new Question("NIGER", "AFRICA"),
            new Question("ZIMBABWE", "AFRICA"),
            new Question("SEYCHELLES", "AFRICA"),
            new Question("GHANA", "AFRICA"),
            new Question("MAROC", "AFRICA"),
            new Question("INDONEZIA", "ASIA"),
            new Question("TAILANDA", "ASIA"),
            new Question("FILIPINE", "ASIA"),
            new Question("SINGAPORE", "ASIA"),
            new Question("HONG KONG", "ASIA"),
            new Question("TAIWAN", "ASIA"),
            new Question("BANGLADESH", "ASIA"),
            new Question("PAKISTAN", "ASIA"),
            new Question("NEPAL", "ASIA"),
            new Question("ARABIA SAUDITA", "ORIENTUL MIJLOCIU"),
            new Question("EMIRATELE ARABE UNITE", "ORIENTUL MIJLOCIU"),
            new Question("ISRAEL", "ORIENTUL MIJLOCIU"),
            new Question("IORDAN", "ORIENTUL MIJLOCIU"),
            new Question("KUWEIT", "ORIENTUL MIJLOCIU"),
            new Question("QATAR", "ORIENTUL MIJLOCIU"),
            new Question("OMAN", "ORIENTUL MIJLOCIU"),
            new Question("YEMEN", "ORIENTUL MIJLOCIU"),

    };

    public static final Question[] sportivi = {
            new Question("SIMONA HALEP", "TENISMENA ROMANCA"),
            new Question("NADIA COMANECI", "FOSTA GIMANSTA ROMANCA"),
            new Question("ROGER FEDERER", "TENISMEN ELVETIAN"),
            new Question("RAFAEL NADAL", "TENISMEN SPANIOL"),
            new Question("LEWIS HAMILTON", "PILOT FORMULA 1 MERCEDES"),
            new Question("MAX VERSTAPPEN", "PILOT FORMULA 1 REDBULL"),
            new Question("MICHAEL SCHUMACHER", "FOST PILOT FORMULA 1"),
            new Question("FLOYD MAYWEATHER", "BOXEOR NEINVINS"),
            new Question("MUHAMMAD ALI", "FOST BOXEOR NEINVINS"),
            new Question("CONOR MCGREGOR", "LUPTATOR UFC"),
            new Question("LIONEL MESSI", "ATACANT ARGENTINIAN"),
            new Question("CRISTIANO RONALDO", "ATACANT PORTUGHEZ"),
            new Question("KYLIAN MBAPPE", "ATACANT FRANCEZ"),
            new Question("NEYMAR JR", "ATACANT BRAZILIAN"),
            new Question("GHEORGHE HAGI", "FOST MIJLOCAS ROMAN"),
            new Question("ADRIAN MUTU", "FOST ATACANT ROMAN"),
            new Question("PAUL POGBA", "MIJLOCAS FRANCEZ"),
            new Question("LUIS SUAREZ", "ATACANT URUGUAIAN"),
            new Question("EDEN HAZARD", "ATACANT BELGIAN"),
            new Question("KARIM BENZEMA", "ATACANT FRANCEZ"),
            new Question("SERGIO RAMOS", "FUNDAS SPANIOL"),
            new Question("SADIO MANE", "ATACANT SENEGALEZ"),
            new Question("VIRGIL VAN DIJK", "FUNDAS OLANDEZ"),
            new Question("ERLING HALAND", "ATACANT NORVEGIAN"),
            new Question("ROBERT LEWANDOWSKI", "ATACANT POLONEZ"),
            new Question("KEVIN DE BRUYNE", "MIJLOCAS BELGIAN"),
            new Question("MOHAMED SALAH", "ATACANT EGIPTEAN"),
            new Question("MANUEL NEUER", "PORTAR GERMAN"),
            new Question("ROMELU LUKAKU", "ATACANT BELGIAN"),
            new Question("ZLATAN IBRAHIMOVIC", "ATACANT SUEDEZ"),
            new Question("ANGEL DI MARIA", "ATACANT ARGENTINIAN"),
            new Question("MARCUS RASHFORD", "ATACANT ENGLEZ"),
            new Question("CIPRIAN TATARUSANU", "PORTAR ROMAN"),
            new Question("BRUNO FERNANDES", "MIJLOCAS PORTUGHEZ"),
            new Question("JOAO FELIX", "ATACANT PORTUGHEZ"),
            new Question("THIBAUT COURTOIS", "PORTAR BELGIAN"),
            new Question("DAVID ALABA", "FUNDAS AUSTRIAC"),
            new Question("MICHAEL JORDAN", "BASCHETBALIST"),
            new Question("LEBRON JAMES", "BASCHETBALIST"),
            new Question("STEPHEN CURRY", "BASCHETBALIST"),
    };

    public static final Question[] capitale = {
            new Question("BUCURESTI", "CAPITALA ROMANIA"),
            new Question("BUDAPESTA", "CAPITALA UNGARIA"),
            new Question("SOFIA", "CAPITALA BULGARIA"),
            new Question("BELGRAD", "CAPITALA SERBIA"),
            new Question("ATENA", "CAPITALA GRECIA"),
            new Question("KIEV", "CAPITALA UCRAINA"),
            new Question("ISTANBUL", "CAPITALA TURCIA"),
            new Question("VARSOVIA", "CAPITALA POLONIA"),
            new Question("VIENA", "CAPITALA AUSTRIA"),
            new Question("BERLIN", "CAPITALA GERMANIA"),
            new Question("PARIS", "CAPITALA FRANTA"),
            new Question("BRUXELLES", "CAPITALA BELGIA"),
            new Question("AMSTERDAM", "CAPITALA OLANDA"),
            new Question("LISABONA", "CAPITALA PORTUGALIA"),
            new Question("MADRID", "CAPITALA SPANIA"),
            new Question("ROMA", "CAPITALA ITALIA"),
            new Question("WASHINGTON DC", "CAPITALA AMERICA"),
            new Question("OTTAWA", "CAPITALA CANADA"),
            new Question("BRASILIA", "CAPITALA BRAZILIA"),
            new Question("BUENOS AIRES", "CAPITALA ARGENTINA"),
            new Question("BEIJING", "CAPITALA CHINA"),
            new Question("TOKYO", "CAPITALA JAPONIA"),
            new Question("CANBERRA", "CAPITALA AUSTRALIA"),
            new Question("LONDRA", "CAPITALA ANGLIA"),
            new Question("DUBLIN", "CAPITALA IRLANDA"),
            new Question("CHISINAU", "CAPITALA MOLDOVA"),
            new Question("MOSCOVA", "CAPITALA RUSIA"),
            new Question("NEW DELHI", "CAPITALA INDIA"),
            new Question("OSLO", "CAPITALA NORVEGIA"),
            new Question("COPENHAGA", "CAPITALA DANEMARCA"),
            new Question("HELSINKI", "CAPITALA FINLANDA"),
            new Question("CAIRO", "CAPITALA EGIPT"),
            new Question("STOCKHOLM", "CAPITALA SUEDIA"),
            new Question("VILNIUS", "CAPITALA LITUANIA"),
            new Question("TALINN", "CAPITALA ESTONIA"),
            new Question("RIGA", "CAPITALA LETONIA"),

    };

    public static final Question[] plante = {
            new Question("TRANDAFIR", "FLOARE CU SPINI"),
            new Question("GHIOCEL", "VESTITORUL PRIMAVERII"),
            new Question("LAVANDA", "PLANTA MOV CU PARFUM"),
            new Question("VANILIE", "MIROS SI AROMA DULCE"),
            new Question("MAC", "FLOARE ROSIE CU SEMINTE COMUNE"),
            new Question("FLOAREA SOARELUI", "SEMINTE NEGRE COMUNE"),
            new Question("LILIAC", "FLOARE MOV DE PRIMAVARA"),
            new Question("PLANTA CARNIVORA", "MANANCA INSECTE"),
            new Question("LALEA", "COMUNA IN OLANDA"),
            new Question("NARCISA", "FLOARE GALBENA"),
            new Question("IRIS", "FLOARE VIOLET"),
            new Question("ORHIDEE", "FLOARE DE APARTAMENT"),
            new Question("ALOE VERA", "PLANTA MEDICINALA"),
            new Question("PANSELUTE", "FLORI MICI COLORATE"),
            new Question("FLORI DE CIRES", "INTALNITE IN JAPONIA"),
            new Question("IASOMIE", "FOARTE PARFUMATA"),
            new Question("MARGARETE", "FLORI ALBE COMUNE"),
            new Question("GALBENELE", "ALIFIE DIN ELE"),
            new Question("MAGNOLIA", "NU ARE PETALE"),
            new Question("GAROAFA", "FLOARE FOARTE INTALNITA"),
            new Question("GLADIOLE", "POPULARE IN ROMANIA SI AFRICA DE SUD"),
            new Question("CRINI", "SIMBOLIZEAZA INOCENTA"),
            new Question("ARTAR", "FRUNZA DE PE STEAGUL CANADEI"),
            new Question("CASTAN", "ARBORE INTALNIT IN ROMANIA"),
            new Question("BRAD", "ARBORE DE CRACIUN"),
            new Question("MOLID", "ASEMANATOR CU BRADUL"),
            new Question("DAFIN", "FRUNZA SE PUNE IN MANCARE"),
            new Question("MESTEACAN", "ARBORE CU LEMN ALB"),
            new Question("SALCIE", "ARBORE PE LANGA APA"),
            new Question("STEJAR", "ARBORE DE CAMPIE"),
            new Question("PIN", "FRUCT IN FORMA DE CON"),
            new Question("TEI", "ARE PROPRIETATI MEDICINALE"),
    };

    public static Question[] aleatoriu;
    Random rand = new Random();
    final static int nrCategorii = 6;
    int categorieAleatorie;
    int pozCuvAles;
    String cuvAles;
    String indiciu;
    String cuvUser = "";
    int nrGreseli = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = findViewById(R.id.homeAD);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        String categorie = getIntent().getStringExtra("categorie");

        switch (categorie) {
            case "ANIMALE": {
                pozCuvAles = rand.nextInt(animale.length);
                cuvAles = animale[pozCuvAles].getRaspunsCorect();
                indiciu = animale[pozCuvAles].getIndiciu();
                break;
            }
            case "FRUCTE SI LEGUME": {
                pozCuvAles = rand.nextInt(fructeLegume.length);
                cuvAles = fructeLegume[pozCuvAles].getRaspunsCorect();
                indiciu = fructeLegume[pozCuvAles].getIndiciu();
                break;
            }
            case "CAPITALE": {
                pozCuvAles = rand.nextInt(capitale.length);
                cuvAles = capitale[pozCuvAles].getRaspunsCorect();
                indiciu = capitale[pozCuvAles].getIndiciu();
                break;
            }
            case "PLANTE": {
                pozCuvAles = rand.nextInt(plante.length);
                cuvAles = plante[pozCuvAles].getRaspunsCorect();
                indiciu = plante[pozCuvAles].getIndiciu();
                break;
            }
            case "SPORTIVI": {
                pozCuvAles = rand.nextInt(sportivi.length);
                cuvAles = sportivi[pozCuvAles].getRaspunsCorect();
                indiciu = sportivi[pozCuvAles].getIndiciu();
                break;
            }
            case "TARI": {
                pozCuvAles = rand.nextInt(tari.length);
                cuvAles = tari[pozCuvAles].getRaspunsCorect();
                indiciu = tari[pozCuvAles].getIndiciu();
                break;
            }
            default: {
                categorieAleatorie = rand.nextInt(nrCategorii);
                switch (categorieAleatorie)
                {
                    case 0:
                    {
                        aleatoriu = animale;
                        categorie = "ANIMALE";
                        break;
                    }
                    case 1:
                    {
                        aleatoriu = capitale;
                        categorie = "CAPITALE";
                        break;
                    }
                    case 2:
                    {
                        aleatoriu = fructeLegume;
                        categorie = "FRUCTE SI LEGUME";
                        break;
                    }
                    case 3:
                    {
                        aleatoriu = plante;
                        categorie = "PLANTE";
                        break;
                    }
                    case 4:
                    {
                        aleatoriu = sportivi;
                        categorie = "SPORTIVI";
                        break;
                    }
                    case 5:
                    {
                        aleatoriu = tari;
                        categorie = "TARI";
                        break;
                    }
                }
                pozCuvAles = rand.nextInt(aleatoriu.length);
                cuvAles = aleatoriu[pozCuvAles].getRaspunsCorect();
                indiciu = aleatoriu[pozCuvAles].getIndiciu();
                break;
            }
        }

        TextView raspTV = findViewById(R.id.rasp);
        TextView indiciuTV = findViewById(R.id.indiciu);

        for(int i = 0; i < cuvAles.length(); i++)
        {
            if(cuvAles.charAt(i) == ' ')
            {
                cuvUser += " ";
            }
            else
                cuvUser += "_";
        }

        raspTV.setText(cuvUser);
        indiciuTV.setText(categorie);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void verifGreseli()
    {
        ImageView spanzuratoareIV = findViewById(R.id.spanzuratoare);
        switch (nrGreseli)
        {
            case 1:
                spanzuratoareIV.setImageDrawable(getDrawable(R.drawable.p2));
                break;
            case 2:
                spanzuratoareIV.setImageDrawable(getDrawable(R.drawable.p3));
                break;
            case 3:
                spanzuratoareIV.setImageDrawable(getDrawable(R.drawable.p4));
                break;
            case 4:
                spanzuratoareIV.setImageDrawable(getDrawable(R.drawable.p5));
                break;
            case 5:
                spanzuratoareIV.setImageDrawable(getDrawable(R.drawable.p6));
                break;
            case 6:
                spanzuratoareIV.setImageDrawable(getDrawable(R.drawable.p7));
                break;
        }

    }

    public void ghici(View v){
        TextView raspTV = findViewById(R.id.rasp);
        Button b = (Button) v;
        String litera = b.getText().toString();
        if(cuvAles.contains(litera))
        {
            b.setBackgroundColor(getResources().getColor(R.color.green));
            b.setEnabled(false);
            int index = cuvAles.indexOf(litera);
            while(index >= 0) {
                cuvUser = cuvUser.substring(0,index) + litera + cuvUser.substring(index + 1);
                raspTV.setText(cuvUser);
                index = cuvAles.indexOf(litera, index + 1);
            }
            if(cuvAles.equals(cuvUser))
            {
                Toast.makeText(this,"FELICITARI, AI GHICIT CORECT!",Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            b.setBackgroundColor(getResources().getColor(R.color.red));
            b.setEnabled(false);
            nrGreseli++;
            verifGreseli();
            if(nrGreseli == 6)
            {
                Toast.makeText(this,"CUVANTUL CORECT ERA: " + cuvAles,Toast.LENGTH_LONG).show();
                finish();
                startActivity(getIntent());
            }
        }
    }
    public void restart(View v)
    {
        finish();
        startActivity(getIntent());
    }

    public void back(View v)
    {
        Intent i = new Intent(this, Categories.class);
        finish();
        startActivity(i);
    }

    public void showHint(View v)
    {
        TextView indiciuTV = findViewById(R.id.indiciu);
        indiciuTV.setText(indiciu);
    }

}