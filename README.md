<h1 align="center">
    Aplikacija #OstaniZdrav - Android
</h1>

V okviru projekta je objavljena slovenska verzija android aplikacije, ki je je povzeta po uradni Corona-Warn-App za Nemčijo. Deluje na  na podlagi API-ja za obveščanje o izpostavljenosti na podlagi mehanizmov, ki jih je izdelal [Apple](https://www.apple.com/covid19/contacttracing/) in [Google](https://www.google.com/covid19/exposurenotifications/). Aplikacije (za iOS in Android) uporabljajo tehnologijo Bluetooth za izmenjavo anonimnih šifriranih podatkov z drugimi mobilnimi telefoni (na katerih je aplikacija tudi nameščena) v bližini telefona uporabnika aplikacije. Podatki so shranjeni lokalno na napravi vsakega uporabnika, kar organom ali drugim strankam preprečuje dostop do podatkov ali nadzor nad njimi. Ta repozitorij vsebuje  Androidovo aplikacijo ostanizdrav za uporabo v Sloveniji. Objava kode je namenjena seznanitvi in pregledu izvorne kode, v tem obdobju ne sprejemamo popravkov, dopolnitev.


## Povezave na izhodiščne dokumente 

* [Home](https://github.com/corona-warn-app/cwa-app-android/wiki)
* [1 Setup](https://github.com/corona-warn-app/cwa-app-android/wiki/1-Setup)
* [2 Backend](https://github.com/corona-warn-app/cwa-app-android/wiki/2-Backend)
* [3 UI](https://github.com/corona-warn-app/cwa-app-android/wiki/3-UI)
* [4 Exposure Notification Google API](https://github.com/corona-warn-app/cwa-app-android/wiki/4-Google-Exposure-Notifications-API)
* [5 Packages](https://github.com/corona-warn-app/cwa-app-android/wiki/5-Packages)

## Slovenska implementacija

* Izvedena je bila prilagoditev grafične podobe
* Vključeni prevodi besedil in ukazov v slovenskem jeziku

## Arhitektura in Dokumentacija

Celotna dokumentacija za originalno verzijo Corona-Warn-App se nahaja v repozitoriju [cwa-dokumentacije](https://github.com/corona-warn-app/cwa-documentation). Repozitorij dokumentacije vsebuje tehnične dokumente, podatke o arhitekturi, specifikacije za uporabniški vmesnik / UX in referenčne dokumente, povezane s to izvedbo.


## Sodelujoči

Nemška vlada je prosila SAP in Deutsche Telekom, naj razvijejo Corona-Warn-App za Nemčijo kot odprtokodno programsko opremo. Deutsche Telekom zagotavlja omrežno in mobilno tehnologijo ter na varen, razširljiv in stabilen način upravlja in poganja zaledje za aplikacijo. SAP je odgovoren za razvoj aplikacije, njen okvir in osnovno platformo. 

Slovenska Vlada je naložila Ministrstvu za javno upravo, da skupaj ob sodelovanju z NIJZ vzpostavi nemški model aplikacije, objavljene na [GitHub](https://github.com/corona-warn-app/cwa-app-android/), za delovanje v Sloveniji. Aplikacije z imenom "ostanizdrav" so prilagojene za android in IoS mobilne telefone.
Podjetje RSTeam je kot izvajalec vključil prevode, ki jih je pripravila prevajalska služba Generalnega sekretariata Vlade RS skupaj z Ministrstvom za javno upravo.
Ministrstvo za javno upravo, kot upravljavec centralne informacijske infrastrukture zagotavlja delovanje zalednega sistema, prav tako povzetega po originalni nemški različici objavljeni na [GitHub](https://github.com/corona-warn-app/cwa-documentation), za potrebe delovanja aplikacij ostanizdrav.


## Povezani repozitoriji izvorne kode

| Repository          | Description                                                           |
| ------------------- | --------------------------------------------------------------------- |
| [cwa-documentation] | Project overview, general documentation, and white papers.            |
| [cwa-wishlist]      | Community feature requests.                                           |
| [cwa-app-ios]       | Native iOS app using the Apple/Google exposure notification API.      |
| [cwa-app-android]   | Native Android app using the Apple/Google exposure notification API.  |
| [cwa-server]        | Backend implementation for the Apple/Google exposure notification API.|
| [cwa-verification-server] | Backend implementation of the verification process. |

[cwa-verification-server]: https://github.com/corona-warn-app/cwa-verification-server
[cwa-documentation]: https://github.com/corona-warn-app/cwa-documentation
[cwa-wishlist]: https://github.com/corona-warn-app/cwa-wishlist
[cwa-app-ios]: https://github.com/corona-warn-app/cwa-app-ios
[cwa-app-android]: https://github.com/corona-warn-app/cwa-app-android
[cwa-server]: https://github.com/corona-warn-app/cwa-server

## Licenciranje

Copyright (c) 2020 SAP SE or an SAP affiliate company.

Licensed under the **Apache License, Version 2.0** (the "License"); you may not use this file except in compliance with the License.

You may obtain a copy of the License at https://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the [LICENSE](./LICENSE) for the specific language governing permissions and limitations under the License.
