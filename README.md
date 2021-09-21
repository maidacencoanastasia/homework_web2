# homework_web2
Exerciții:

Scrie un REST controler, iar în el câte o metodă mapată la o cerere HTTP astfel încât:

metoda să afișeze URL-ul aplicației relativ la adresa serverului

metoda să afișeze URL-ul metodei mapate relativ la adresa aplicației

metoda să afișeze URL-ul absolut al cererii HTTP

metoda să afișeze partea adresei din cerere fără protocol și șirul de perechi nume=valoare (en. query string)

metoda să afișeze șirul de perechi nume=valoare (en. query string) a cererii HTTP.

HINT
vezi metodele HttpServletRequest.getContextPath(), HttpServletRequest.getQueryString(), HttpServletRequest.getRequestURI(), HttpServletRequest.getRequestURL(), HttpServletRequest.getServletPath()

Scrie un REST controler, iar în el câte o metodă mapată la o cerere HTTP astfel încât:

metoda să afișeze lista de cookie-uri

metoda să afișeze lista de antete cerere

metoda să afișeze lista de parametri din query string.

HINT
vezi metodele HttpServletRequest.getCookies(), HttpServletRequest.getHeaderNames(), HttpServletRequest.getHeader()

Scrie un rest controler, iar in acest controler:

o metoda add() care primește doi parametri de tip întreg si intoarce suma acestora

o metoda concat() care primește doi parametri de tip String și întoarce valoarea concatenată

daca ai folosit adnotarea @GetMapping rescrie controlerul să foloseasca doar @RequestMapping și invers

rescrie metoda add() astfel incat sș primeasca un al iii-lea parametru care va specifica tipul operației: adunare sau înmulțire, respectiv metoda va fi redenumita în op()

sparge metoda op() în două metode specialziate: add() și mul() folosind opțiunea parameters din adnotările @GetMapping/@RequestMapping.

declară o clasa Operation cu doua câmpuri întregi și rescrie metodele add() și mul() astfel incât parametrii sa fie agregați într-un obiect de tip Operation (@RequestBody)

rescrie metoda concat() astfel incât să accepte cereri către adrese de orice nivel și metoda să concateneze toate nivelele (HttpServletRequest.html#getRequestURI() și split după /).

Scrie un controler care va simula un navigator de fișiere. Acest controler trebuie să întoarcă true pentru dosarele existente. Nivele adresei le vom privi drept dosare. Dosarul de la un nivel este subdosar pentru nivelul precedent și este parinte pentru nivelul următor. De exemplu, in /a/b/c, b este subdosar pentru a și în același timp este părinte pentru c. Scrie câte o metodă care să confirm€ existența dosarului care respecta condițiile:

c și d sunt dosare radăcină

x este subdosarul lui c

y este subdosarul oricarui dosar care se conține în d

Creeaza un controler adnotat cu @Controller care să conțină două metode, o metoda întoarce o lista de string-uri care sunt folosite pentru a umple un șablon HTML, iar altă metodă întoarce aceeași listă însă în format JSON.
