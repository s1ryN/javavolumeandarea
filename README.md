# javavolumeandarea
## Zadání
Vytvořte program v objektově orientovaném jazyce Java, který pomocí dědičnosti a polymorfizmu umožní uživateli vypočítat objemy a plochy těchto základních geometrických tvarů:

krychle, kvádr, pyramida, kužel, jehlan, koule, válec.

Implementujte v programu interface s názvem "Vypocet", který obsahuje metody pro výpočet objemu ("vypocetObjemu()") a plochy ("vypocetPlochy()"):

// Rozhraní pro výpočet objemu a plochy public interface Vypocet { double vypocetObjemu(); double vypocetPlochy(); }

V programu vytvořte menu, jenž umožní uživateli vybrat tvar, pro který chce vypočítat objem a plochu, dokud menu neopustí volbou Konec. Po výběru tvaru nechte uživatele zadat potřebné rozměry (např. délku strany, poloměr, atd.). Na základě výběru tvaru a zadaných rozměrů použijte polymorfismus pro volání příslušných metod pro výpočet objemu a plochy daného tvaru. Výsledky výpočtu vypište uživateli.
