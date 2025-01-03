# Spring Web Application - Hello Vistula

Aplikacja **"Hello Vistula"** to prosty projekt oparty na frameworku Spring, który umożliwia interakcję z dwiema stronami internetowymi.

## Cel projektu
Projekt demonstruje:
- Podstawowe funkcjonalności Spring Framework.
- Wykorzystanie Thymeleaf jako silnika szablonów.

## Funkcjonalności
1. **Strona powitalna**  
   Na pierwszej stronie aplikacja wyświetla komunikat powitalny.

2. **Personalizowana wiadomość**  
   Użytkownik może wprowadzić swoje imię na drugiej stronie, a aplikacja wyświetli spersonalizowaną wiadomość.

---

Aplikacja jest doskonałym przykładem na poznanie podstaw Springa oraz implementację prostych funkcji w oparciu o popularne technologie webowe.  

## Funkcjonalności

### Strona główna ("/")
Po wejściu na stronę główną użytkownik zobaczy powitalną wiadomość:

> **"Hello Vistula, in my first Spring controller!"**

---

### Strona powitania ("/greeting")
Na tej stronie użytkownik może podać swoje imię poprzez parametr URL. Przykład:
http://localhost:8080/greeting?name=Vistula
Aplikacja wyświetli spersonalizowane powitanie, takie jak:

> **"Hello, Vistula!"**

Jeśli użytkownik nie poda imienia, aplikacja użyje domyślnej wartości `"World"`, wyświetlając:

> **"Hello, World!"**

---

### Obrazek
Na stronie powitania użytkownik zobaczy również obrazek (np. Logo uczelni), który jest załadowany z zewnętrznego źródła.

![images.png](..%2FUsers%2FUser%2FPictures%2Fimages.png)


