package about

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class About : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div(classes = "about-wrapper") {
            h2 { +"Datenschutzerklärung" }
            br {}
            div {
                h3(classes = "dsg-general-intro") {}
                p {
                    +"Diese Datenschutzerklärung klärt Sie über die Art, den Umfang und Zweck der Verarbeitung von personenbezogenen Daten (nachfolgend kurz „Daten“) innerhalb unseres Onlineangebotes und der mit ihm verbundenen Webseiten, Funktionen und Inhalte sowie externen Onlinepräsenzen, wie z.B. unser Social Media Profile auf (nachfolgend gemeinsam bezeichnet als „Onlineangebot“). Im Hinblick auf die verwendeten Begrifflichkeiten, wie z.B. „Verarbeitung“ oder „Verantwortlicher“ verweisen wir auf die Definitionen im Art. 4 der Datenschutzgrundverordnung (DSGVO)."
                    br {}
                }
            }
            div {
                h3(classes = "dsg-general-controller") { +"Verantwortlicher" }
                p {
                    span(classes = "tsmcontroller") {
                        +"Alexander Girke"
                        br {}
                        +"Untere Eichstädtstraße 7"
                        br {}
                        +"04299 Leipzig"
                        br {}
                        +"Deutschland"
                        br {}
                        br {}
                        +"E-Mailadresse: alexgirke@web.de"
                    }
                }
            }
            div {
                h3(classes = "dsg-general-datatype") {
                    +"Arten der verarbeiteten Daten:"
                }
                p {
                    +"- Bestandsdaten(z.B., Namen, Adressen)."
                    br {}
                    +"- Kontaktdaten(z.B., E - Mail, Telefonnummern)."
                    br {}
                    +"- Inhaltsdaten(z.B., Texteingaben, Fotografien, Videos)."
                    br {}
                    +"- Nutzungsdaten(z.B., besuchte Webseiten, Interesse an Inhalten, Zugriffszeiten)."
                    br {}
                    +"- Meta - / Kommunikationsdaten (z.B., Geräte-Informationen, IP-Adressen)."
                    br {}
                }
            }
            div {
                h3(classes = "dsg-general-datasubjects") {
                    +"Kategorien betroffener Personen"
                }
                p {
                    +"Besucher und Nutzer des Onlineangebotes(Nachfolgend bezeichnen wir die betroffenen Personen zusammenfassend auch als „ Nutzer “)."
                    br {}
                }
            }
            div {
                h3(classes = "dsg-general-purpose") {
                    +"Zweck der Verarbeitung"
                }
                p {
                    +"- Zurverfügungstellung des Onlineangebotes, seiner Funktionen und  Inhalte."
                    br {}
                    +"- Beantwortung von Kontaktanfragen und Kommunikation mit Nutzern."
                    br {}
                    +"- Sicherheitsmaßnahmen."
                    br {}
                    +"- Reichweitenmessung / Marketing"
                    br {}
                    span(classes = "tsmcom") {}
                }
            }
            div {
                h3(classes = "dsg-general-terms") {
                    +"Verwendete Begrifflichkeiten"
                }
                p {
                    +"„Personenbezogene Daten “ sind alle Informationen, die sich auf eine identifizierte oder identifizierbare natürliche Person (im Folgenden „betroffene Person“) beziehen; als identifizierbar wird eine natürliche Person angesehen, die direkt oder indirekt, insbesondere mittels Zuordnung zu einer Kennung wie einem Namen, zu einer Kennnummer, zu Standortdaten, zu einer Online-Kennung (z.B. Cookie) oder zu einem oder mehreren besonderen Merkmalen identifiziert werden kann, die Ausdruck der physischen, physiologischen, genetischen, psychischen, wirtschaftlichen, kulturellen oder sozialen Identität dieser natürlichen Person sind."
                    br {}
                    +"„Verarbeitung“ ist jeder mit oder ohne Hilfe automatisierter Verfahren ausgeführte Vorgang oder jede solche Vorgangsreihe im Zusammenhang mit personenbezogenen Daten. Der Begriff reicht weit und umfasst praktisch jeden Umgang mit Daten."
                    br {}
                    +"„Pseudonymisierung“ die Verarbeitung personenbezogener Daten in einer Weise, dass die personenbezogenen Daten ohne Hinzuziehung zusätzlicher Informationen nicht mehr einer spezifischen betroffenen Person zugeordnet werden können, sofern diese zusätzlichen Informationen gesondert aufbewahrt werden und technischen und organisatorischen Maßnahmen unterliegen, die gewährleisten, dass die personenbezogenen Daten nicht einer identifizierten oder identifizierbaren natürlichen Person zugewiesen werden."
                    br {}
                    +"„Profiling“ jede Art der automatisierten Verarbeitung personenbezogener Daten, die darin besteht, dass diese personenbezogenen Daten verwendet werden, um bestimmte persönliche Aspekte, die sich auf eine natürliche Person beziehen, zu bewerten, insbesondere um Aspekte bezüglich Arbeitsleistung, wirtschaftliche Lage, Gesundheit, persönliche Vorlieben, Interessen, Zuverlässigkeit, Verhalten, Aufenthaltsort oder Ortswechsel dieser natürlichen Person zu analysieren oder vorherzusagen."
                    br {}
                    +"Als „Verantwortlicher“ wird die natürliche oder juristische Person, Behörde, Einrichtung oder andere Stelle, die allein oder gemeinsam mit anderen über die Zwecke und Mittel der Verarbeitung von personenbezogenen Daten entscheidet, bezeichnet."
                    br {}
                    +"„Auftragsverarbeiter“ eine natürliche oder juristische Person, Behörde, Einrichtung oder andere Stelle, die personenbezogene Daten im Auftrag des Verantwortlichen verarbeitet."
                    br {}
                }
            }
            div {
                h3(classes = "dsg-general-legalbasis") {
                    +"Maßgebliche Rechtsgrundlagen"
                }
                p {
                    +"Nach Maßgabe des Art . 13 DSGVO teilen wir Ihnen die Rechtsgrundlagen unserer Datenverarbeitungen mit. Sofern die Rechtsgrundlage in der Datenschutzerklärung nicht genannt wird, gilt Folgendes: Die Rechtsgrundlage für die Einholung von Einwilligungen ist Art. 6 Abs. 1 lit. a und Art. 7 DSGVO, die Rechtsgrundlage für die Verarbeitung zur Erfüllung unserer Leistungen und Durchführung vertraglicher Maßnahmen sowie Beantwortung von Anfragen ist Art. 6 Abs. 1 lit. b DSGVO, die Rechtsgrundlage für die Verarbeitung zur Erfüllung unserer rechtlichen Verpflichtungen ist Art. 6 Abs. 1 lit. c DSGVO, und die Rechtsgrundlage für die Verarbeitung zur Wahrung unserer berechtigten Interessen ist Art. 6 Abs. 1 lit. f DSGVO. Für den Fall, dass lebenswichtige Interessen der betroffenen Person oder einer anderen natürlichen Person eine Verarbeitung personenbezogener Daten erforderlich machen, dient Art. 6 Abs. 1 lit. d DSGVO als Rechtsgrundlage."
                }
            }
            div {
                h3(classes = "dsg-general-securitymeasures") {
                    +"Sicherheitsmaßnahmen"
                }
                p {
                    +"Wir treffen nach Maßgabe des Art . 32 DSGVO unter Berücksichtigung des Stands der Technik, der Implementierungskosten und der Art, des Umfangs, der Umstände und der Zwecke der Verarbeitung sowie der unterschiedlichen Eintrittswahrscheinlichkeit und Schwere des Risikos für die Rechte und Freiheiten natürlicher Personen, geeignete technische und organisatorische Maßnahmen, um ein dem Risiko angemessenes Schutzniveau zu gewährleisten."
                    br {}
                    +"Zu den Maßnahmen gehören insbesondere die Sicherung der Vertraulichkeit, Integrität und Verfügbarkeit von Daten durch Kontrolle des physischen Zugangs zu den Daten, als auch des sie betreffenden Zugriffs, der Eingabe, Weitergabe, der Sicherung der Verfügbarkeit und ihrer Trennung. Des Weiteren haben wir Verfahren eingerichtet, die eine Wahrnehmung von Betroffenenrechten, Löschung von Daten und Reaktion auf Gefährdung der Daten gewährleisten. Ferner berücksichtigen wir den Schutz personenbezogener Daten bereits bei der Entwicklung, bzw. Auswahl von Hardware, Software sowie Verfahren, entsprechend dem Prinzip des Datenschutzes durch Technikgestaltung und durch datenschutzfreundliche Voreinstellungen (Art. 25 DSGVO)."
                    br {}
                }
            }
            div {
                h3(classes = "dsg-general-coprocessing") {
                    +"Zusammenarbeit mit Auftragsverarbeitern und Dritten"
                }
                p {
                    +"Sofern wir im Rahmen unserer Verarbeitung Daten gegenüber anderen Personen und Unternehmen (Auftragsverarbeitern oder Dritten) offenbaren, sie an diese übermitteln oder ihnen sonst Zugriff auf die Daten gewähren, erfolgt dies nur auf Grundlage einer gesetzlichen Erlaubnis (z.B. wenn eine Übermittlung der Daten an Dritte, wie an Zahlungsdienstleister, gem. Art. 6 Abs. 1 lit. b DSGVO zur Vertragserfüllung erforderlich ist), Sie eingewilligt haben, eine rechtliche Verpflichtung dies vorsieht oder auf Grundlage unserer berechtigten Interessen (z.B. beim Einsatz von Beauftragten, Webhostern, etc.)."
                    br {}
                    +"Sofern wir Dritte mit der Verarbeitung von Daten auf Grundlage eines sog . „Auftragsverarbeitungsvertrages“ beauftragen, geschieht dies auf Grundlage des Art. 28 DSGVO."
                }
            }
            div {
                h3(classes = "dsg-general-thirdparty") {
                    +"Übermittlungen in Drittländer"
                }
                p {
                    +"Sofern wir Daten in einem Drittland (d.h.außerhalb der Europäischen Union (EU) oder des Europäischen Wirtschaftsraums(EWR)) verarbeiten oder dies im Rahmen der Inanspruchnahme von Diensten Dritter oder Offenlegung, bzw. Übermittlung von Daten an Dritte geschieht, erfolgt dies nur, wenn es zur Erfüllung unserer (vor)vertraglichen Pflichten, auf Grundlage Ihrer Einwilligung, aufgrund einer rechtlichen Verpflichtung oder auf Grundlage unserer berechtigten Interessen geschieht. Vorbehaltlich gesetzlicher oder vertraglicher Erlaubnisse, verarbeiten oder lassen wir die Daten in einem Drittland nur beim Vorliegen der besonderen Voraussetzungen der Art. 44 ff. DSGVO verarbeiten. D.h. die Verarbeitung erfolgt z.B. auf Grundlage besonderer Garantien, wie der offiziell anerkannten Feststellung eines der EU entsprechenden Datenschutzniveaus (z.B. für die USA durch das „Privacy Shield“) oder Beachtung offiziell anerkannter spezieller vertraglicher Verpflichtungen (so genannte „Standardvertragsklauseln“)."
                }
            }
            div {
                h3(classes = "dsg-general-rightssubject") {
                    +"Rechte der betroffenen Personen"
                }
                p {
                    +"Sie haben das Recht, eine Bestätigung darüber zu verlangen, ob betreffende Daten verarbeitet werden und auf Auskunft über diese Daten sowie auf weitere Informationen und Kopie der Daten entsprechend Art. 15 DSGVO."
                    br {}
                    +"Sie haben entsprechend.Art.16 DSGVO das Recht, die Vervollständigung der Sie betreffenden Daten oder die Berichtigung der Sie betreffenden unrichtigen Daten zu verlangen."
                    br {}
                    +"Sie haben nach Maßgabe des Art . 17 DSGVO das Recht zu verlangen, dass betreffende Daten unverzüglich gelöscht werden, bzw. alternativ nach Maßgabe des Art. 18 DSGVO eine Einschränkung der Verarbeitung der Daten zu verlangen."
                    br {}
                    +"Sie haben das Recht zu verlangen, dass die Sie betreffenden Daten, die Sie uns bereitgestellt haben nach Maßgabe des Art. 20 DSGVO zu erhalten und deren Übermittlung an andere Verantwortliche zu fordern."
                    br {}
                    +"Sie haben ferner gem . Art . 77 DSGVO das Recht, eine Beschwerde bei der zuständigen Aufsichtsbehörde einzureichen."
                }
            }
            div {
                h3(classes = "dsg-general-revokeconsent") {
                    +"Widerrufsrecht"
                }
                p {
                    +"Sie haben das Recht, erteilte Einwilligungen gem. Art. 7 Abs. 3 DSGVO mit Wirkung für die Zukunft zu widerrufen"
                }
            }
            div {
                h3(classes = "dsg-general-object") {
                    +"Widerspruchsrecht"
                }
                p {
                    +"Sie können der künftigen Verarbeitung der Sie betreffenden Daten nach Maßgabe des Art.21 DSGVO jederzeit widersprechen . Der Widerspruch kann insbesondere gegen die Verarbeitung für Zwecke der Direktwerbung erfolgen."
                }
            }
            div {
                h3(classes = "dsg-general-cookies") {
                    +"Cookies und Widerspruchsrecht bei Direktwerbung"
                }
                p {
                    +"Als „Cookies“ werden kleine Dateien bezeichnet, die auf Rechnern der Nutzer gespeichert werden. Innerhalb der Cookies können unterschiedliche Angaben gespeichert werden. Ein Cookie dient primär dazu, die Angaben zu einem Nutzer (bzw. dem Gerät auf dem das Cookie gespeichert ist) während oder auch nach seinem Besuch innerhalb eines Onlineangebotes zu speichern. Als temporäre Cookies, bzw. „Session-Cookies“ oder „transiente Cookies“, werden Cookies bezeichnet, die gelöscht werden, nachdem ein Nutzer ein Onlineangebot verlässt und seinen Browser schließt. In einem solchen Cookie kann z.B. der Inhalt eines Warenkorbs in einem Onlineshop oder ein Login-Status gespeichert werden. Als „permanent“ oder „persistent“ werden Cookies bezeichnet, die auch nach dem Schließen des Browsers gespeichert bleiben. So kann z.B. der Login-Status gespeichert werden, wenn die Nutzer diese nach mehreren Tagen aufsuchen. Ebenso können in einem solchen Cookie die Interessen der Nutzer gespeichert werden, die für Reichweitenmessung oder Marketingzwecke verwendet werden. Als „Third-Party-Cookie“ werden Cookies bezeichnet, die von anderen Anbietern als dem Verantwortlichen, der das Onlineangebot betreibt, angeboten werden (andernfalls, wenn es nur dessen Cookies sind spricht man von „First-Party Cookies“)."
                    br {}
                    +"Wir können temporäre und permanente Cookies einsetzen und klären hierüber im Rahmen unserer Datenschutzerklärung auf."
                    br {}
                    +"Falls die Nutzer nicht möchten, dass Cookies auf ihrem Rechner gespeichert werden, werden sie gebeten die entsprechende Option in den Systemeinstellungen ihres Browsers zu deaktivieren. Gespeicherte Cookies können in den Systemeinstellungen des Browsers gelöscht werden. Der Ausschluss von Cookies kann zu Funktionseinschränkungen dieses Onlineangebotes führen."
                    br {}
                    +"Ein genereller Widerspruch gegen den Einsatz der zu Zwecken des Onlinemarketing eingesetzten Cookies kann bei einer Vielzahl der Dienste, vor allem im Fall des Trackings, über die US-amerikanische Seite"
                    a(href = "http://www.aboutads.info/choices/") {
                        +"http://www.aboutads.info/choices/"
                    }
                    +"oder die EU-Seite"
                    a(href = "http://www.youronlinechoices.com/") {
                        +"http://www.youronlinechoices.com/"
                    }
                    +" erklärt werden. Des Weiteren kann die Speicherung von Cookies mittels deren Abschaltung in den Einstellungen des Browsers erreicht werden. Bitte beachten Sie, dass dann gegebenenfalls nicht alle Funktionen dieses Onlineangebotes genutzt werden können."
                }
            }
            div {
                h3(classes = "dsg-general-erasure") {
                    +"Löschung von Daten"
                }
                p {
                    +"Die von uns verarbeiteten Daten werden nach Maßgabe der Art. 17 und 18 DSGVO gelöscht oder in ihrer Verarbeitung eingeschränkt. Sofern nicht im Rahmen dieser Datenschutzerklärung ausdrücklich angegeben, werden die bei uns gespeicherten Daten gelöscht, sobald sie für ihre Zweckbestimmung nicht mehr erforderlich sind und der Löschung keine gesetzlichen Aufbewahrungspflichten entgegenstehen. Sofern die Daten nicht gelöscht werden, weil sie für andere und gesetzlich zulässige Zwecke erforderlich sind, wird deren Verarbeitung eingeschränkt. D.h. die Daten werden gesperrt und nicht für andere Zwecke verarbeitet. Das gilt z.B. für Daten, die aus handels- oder steuerrechtlichen Gründen aufbewahrt werden müssen."
                    br {}
                    +"Nach gesetzlichen Vorgaben in Deutschland, erfolgt die Aufbewahrung insbesondere für 10 Jahre gemäß §§ 147 Abs. 1 AO, 257 Abs. 1 Nr. 1 und 4, Abs. 4 HGB (Bücher, Aufzeichnungen, Lageberichte, Buchungsbelege, Handelsbücher, für Besteuerung relevanter Unterlagen, etc.) und 6 Jahre gemäß § 257 Abs. 1 Nr. 2 und 3, Abs. 4 HGB (Handelsbriefe)."
                    br {}
                    +"Nach gesetzlichen Vorgaben in Österreich erfolgt die Aufbewahrung insbesondere für 7 J gemäß § 132 Abs. 1 BAO (Buchhaltungsunterlagen, Belege/Rechnungen, Konten, Belege, Geschäftspapiere, Aufstellung der Einnahmen und Ausgaben, etc.), für 22 Jahre im Zusammenhang mit Grundstücken und für 10 Jahre bei Unterlagen im Zusammenhang mit elektronisch erbrachten Leistungen, Telekommunikations-, Rundfunk-und Fernsehleistungen, die an Nichtunternehmer in EU-Mitgliedstaaten erbracht werden und für die der Mini-One-Stop-Shop (MOSS) in Anspruch genommen wird."
                }
                p {}
            }
            div {
                h3(classes = "dsg-commercialpurpose") {
                    +"Geschäftsbezogene Verarbeitung"
                }
                p {
                    span(classes = "ts-muster-content") {
                        +"Zusätzlich verarbeiten wir"
                        br {}
                        +"- Vertragsdaten(z.B., Vertragsgegenstand, Laufzeit, Kundenkategorie)."
                        br {}
                        +"- Zahlungsdaten(z.B., Bankverbindung, Zahlungshistorie)"
                        br {}
                        +"von unseren Kunden, Interessenten und Geschäftspartner zwecks Erbringung vertraglicher Leistungen, Service und Kundenpflege, Marketing, Werbung und Marktforschung."
                    }
                }
                p {}
            }
            div {
                h3(classes = "dsg-services-agents") {
                    +"Maklerleistungen"
                }
                p {
                    span(classes = "ts-muster-content") {
                        +"Wir verarbeiten die Daten unserer Kunden, Klienten und Interessenten (einheitlich bezeichnet als „Kunden“) entsprechen Art. 6 Abs. 1 lit. b. DSGVO, um ihnen gegenüber unsere vertraglichen oder vorvertraglichen Leistungen zu erbringen.  Die hierbei verarbeiteten Daten, die Art, der Umfang und der Zweck und die Erforderlichkeit ihrer Verarbeitung bestimmen sich nach dem zugrundeliegenden Auftrag. Dazu gehören grundsätzlich Bestands-und Stammdaten der Kunden (Name, Adresse, etc.), als auch die Kontaktdaten (E-Mailadresse, Telefon, etc.), die Vertragsdaten (Inhalt der Beauftragung, Entgelte, Laufzeiten, Angaben zu den vermittelten Unternehmen/ Versicherern/ Leistungen) und Zahlungsdaten (Provisionen, Zahlungshistorie, etc.). Wir können ferner die Angaben zu den Eigenschaften und Umständen von Personen oder ihnen gehörenden Sachen verarbeiten, wenn dies zum Gegenstand unseres Auftrags gehört. Dies können z.B. Angaben zu persönlichen Lebensumständen, mobilen oder immobilen Sachgütern sein."
                        br {}
                        +"In Rahmen unserer Beauftragung kann es auch erforderlich sein, dass wir besondere Kategorien von Daten gem. Art. 9 Abs. 1 DSGVO, hier insbesondere Angaben zur Gesundheit einer Person verarbeiten. Hierzu holen wir, sofern erforderlich, gem. Art. 6 Abs. 1 lit a., Art. 7, Art. 9 Abs. 2 lit. a DSGVO eine ausdrückliche Einwilligung der Kunden ein."
                        br {}
                        +"Sofern für die Vertragserfüllung oder gesetzlich erforderlich, offenbaren oder übermitteln wir die Daten der Kunden im Rahmen von Deckungsanfragen, Abschlüssen und Abwicklungen von Verträgen Daten an Anbieter der vermittelten Leistungen/ Objekte, Versicherer, Rückversicherer, Maklerpools, technische Dienstleister, sonstige Dienstleister, wie z.B. kooperierende Verbände, sowie Finanzdienstleister, Kreditinstitute und Kapitalanlagegesellschaften sowie Sozialversicherungsträger, Steuerbehörden, Steuerberater, Rechtsberater, Wirtschaftsprüfer, Versicherungs-Ombudsmänner und die Anstalten Bundesanstalt für Finanzdienstleistungsaufsicht (BaFin). Ferner können wir Unterauftragnehmer beauftragen, wie z.B. Untervermittler. Wir holen eine Einwilligung der Kunden ein, sofern diese zur Offenbarung/ Übermittlung eine Einwilligung der Kunden erforderlich ist (was z.B. im Fall von besonderen Kategorien von Daten gem. Art. 9 DSGVO der Fall sein kann)."
                        br {}
                        +"Die Löschung der Daten erfolgt nach Ablauf gesetzlicher Gewährleistungs - und vergleichbarer Pflichten, wobei die Erforderlichkeit der Aufbewahrung der Daten alle drei Jahre überprüft wird; im Übrigen gelten die gesetzlichen Aufbewahrungspflichten ."
                        br {}
                        +"Im Fall der gesetzlichen Archivierungspflichten erfolgt die Löschung nach deren Ablauf.Aufbewahrungspflichtig sind insbesondere nach deutschem Recht in der Versicherungs - und Finanzbranche Beratungsprotokolle für 5 Jahre, Maklerschlussnoten für 7 Jahre und Maklerverträge für 5 Jahres sowie generell 6 Jahre für handelsrechtlich relevante Unterlagen und 10 Jahre für steuerrechtlich relevante Unterlagen."
                        br {}
                    }
                }
                p {}
            }
            div {
                h3(classes = "dsg-services-payment") {
                    +"Externe Zahlungsdienstleister"
                }
                p {
                    span(classes = "ts-muster-content") {
                        +"Wir setzen externe Zahlungsdienstleister ein, über deren Plattformen die Nutzer und wir Zahlungstransaktionen vornehmen können (z.B., jeweils mit Link zur Datenschutzerklärung, Paypal (https://www.paypal.com/de/webapps/mpp/ua/privacy-full), Klarna (https://www.klarna.com/de/datenschutz/), Skrill (https://www.skrill.com/de/fusszeile/datenschutzrichtlinie/), Giropay (https://www.giropay.de/rechtliches/datenschutz-agb/), Visa (https://www.visa.de/datenschutz), Mastercard (https://www.mastercard.de/de-de/datenschutz.html), American Express (https://www.americanexpress.com/de/content/privacy-policy-statement.html)"
                        br {}
                        br {}
                        +"Im Rahmen der Erfüllung von&nbsp;Verträgen setzen wir die Zahlungsdienstleister auf Grundlage des Art.6 Abs . 1 lit. b. DSGVO ein. Im Übrigen setzen wir externe&nbsp;Zahlungsdienstleister auf Grundlage unserer berechtigten Interessen gem.Art.6 Abs . 1 lit. f. DSGVO ein, um unseren Nutzern effektive und sichere Zahlungsmöglichkeit zu bieten."
                        br {}
                        br {}
                        +"Zu den, durch die Zahlungsdienstleister verarbeiteten Daten gehören Bestandsdaten, wie z.B. der Name und die Adresse, Bankdaten, wie z.B. Kontonummern oder Kreditkartennummern, Passwörter, TANs und Prüfsummen sowie die Vertrags-, Summen und empfängerbezogenen Angaben. Die Angaben sind erforderlich, um die Transaktionen durchzuführen. Die eingegebenen Daten werden jedoch nur durch die Zahlungsdienstleister verarbeitet und bei diesen gespeichert. D.h. wir erhalten keine konto-oder kreditkartenbezogenen Informationen, sondern lediglich Informationen mit Bestätigung oder Negativbeauskunftung der Zahlung.&nbsp;Unter Umständen werden die Daten seitens der Zahlungsdienstleister an Wirtschaftsauskunfteien übermittelt.Diese Übermittlung bezweckt die Identitäts - und Bonitätsprüfung . Hierzu verweisen wir auf die AGB und Datenschutzhinweise der & nbsp;Zahlungsdienstleister."
                        br {}
                        br {}
                        +"Für die Zahlungsgeschäfte gelten die Geschäftsbedingungen und die Datenschutzhinweise der jeweiligen Zahlungsdienstleister, welche innerhalb der jeweiligen Webseiten, bzw. Transaktionsapplikationen abrufbar sind. Wir verweisen auf diese ebenfalls zwecks weiterer Informationen und Geltendmachung von Widerrufs-, Auskunfts-und anderen Betroffenenrechten."
                    }
                    p {}
                }
            }
            div {
                h3(classes = "dsg-administration") {
                    +"Administration, Finanzbuchhaltung, Büroorganisation, Kontaktverwaltung"
                }
                p {
                    span(classes = "ts-muster-content") {
                        +"Wir verarbeiten Daten im Rahmen von Verwaltungsaufgaben sowie Organisation unseres Betriebs, Finanzbuchhaltung und Befolgung der gesetzlichen Pflichten, wie z.B. der Archivierung. Hierbei verarbeiten wir dieselben Daten, die wir im Rahmen der Erbringung unserer vertraglichen Leistungen verarbeiten. Die Verarbeitungsgrundlagen sind Art. 6 Abs. 1 lit. c. DSGVO, Art. 6 Abs. 1 lit. f. DSGVO. Von der Verarbeitung sind Kunden, Interessenten, Geschäftspartner und Websitebesucher betroffen. Der Zweck und unser Interesse an der Verarbeitung liegt in der Administration, Finanzbuchhaltung, Büroorganisation, Archivierung von Daten, also Aufgaben die der Aufrechterhaltung unserer Geschäftstätigkeiten, Wahrnehmung unserer Aufgaben und Erbringung unserer Leistungen dienen. Die Löschung der Daten im Hinblick auf vertragliche Leistungen und die vertragliche Kommunikation entspricht den, bei diesen Verarbeitungstätigkeiten genannten Angaben."
                        br {}
                        br {}
                        +"Wir offenbaren oder übermitteln hierbei Daten an die Finanzverwaltung, Berater, wie z.B., Steuerberater oder Wirtschaftsprüfer sowie weitere Gebührenstellen und Zahlungsdienstleister."
                        br {}
                        br {}
                        +"Ferner speichern wir auf Grundlage unserer betriebswirtschaftlichen Interessen Angaben zu Lieferanten, Veranstaltern und sonstigen Geschäftspartnern, z.B. zwecks späterer Kontaktaufnahme. Diese mehrheitlich unternehmensbezogenen Daten, speichern wir grundsätzlich dauerhaft."
                        br {}
                    }
                }
                p {}
            }
            div {
                h3(classes = "dsg-contact") {
                    +"Kontaktaufnahme"
                }
                p {
                    span(classes = "ts-muster-content") {
                        +"Bei der Kontaktaufnahme mit uns(z.B.per Kontaktformular, E - Mail, Telefon oder via sozialer Medien) werden die Angaben des Nutzers zur Bearbeitung der Kontaktanfrage und deren Abwicklung gem . Art . 6 Abs. 1 lit. b. (im Rahmen vertraglicher-/vorvertraglicher Beziehungen), Art. 6 Abs. 1 lit. f. (andere Anfragen) DSGVO verarbeitet..Die Angaben der Nutzer können in einem Customer-Relationship-Management System (\"CRM System\") oder vergleichbarer Anfragenorganisation gespeichert werden."
                        br {}
                        br {}
                        +"Wir löschen die Anfragen, sofern diese nicht mehr erforderlich sind. Wir überprüfen die Erforderlichkeit alle zwei Jahre; Ferner gelten die gesetzlichen Archivierungspflichten."
                    }
                }
            }
            div {
                h3(classes = "dsg-newsletter-de") { +"Newsletter" }
                p {
                    span(classes = "ts-muster-content") {
                        +"Mit den nachfolgenden Hinweisen informieren wir Sie über die Inhalte unseres Newsletters sowie das Anmelde -, Versand-und das statistische Auswertungsverfahren sowie Ihre Widerspruchsrechte auf. Indem Sie unseren Newsletter abonnieren, erklären Sie sich mit dem Empfang und den beschriebenen Verfahren einverstanden."
                        br {}
                        +"Inhalt des Newsletters: Wir versenden Newsletter, E-Mails und weitere elektronische Benachrichtigungen mit werblichen Informationen (nachfolgend „Newsletter“) nur mit der Einwilligung der Empfänger oder einer gesetzlichen Erlaubnis. Sofern im Rahmen einer Anmeldung zum Newsletter dessen Inhalte konkret umschrieben werden, sind sie für die Einwilligung der Nutzer maßgeblich. Im Übrigen enthalten unsere Newsletter Informationen zu unseren Leistungen und uns."
                        br {}
                        +"Double - Opt - In und Protokollierung: Die Anmeldung zu unserem Newsletter erfolgt in einem sog. Double-Opt-In-Verfahren. D.h. Sie erhalten nach der Anmeldung eine E-Mail, in der Sie um die Bestätigung Ihrer Anmeldung gebeten werden. Diese Bestätigung ist notwendig, damit sich niemand mit fremden E-Mailadressen anmelden kann. Die Anmeldungen zum Newsletter werden protokolliert, um den Anmeldeprozess entsprechend den rechtlichen Anforderungen nachweisen zu können. Hierzu gehört die Speicherung des Anmelde-und des Bestätigungszeitpunkts, als auch der IP-Adresse. Ebenso werden die Änderungen Ihrer bei dem Versanddienstleister gespeicherten Daten protokolliert."
                        br {}
                        +"Anmeldedaten: Um sich für den Newsletter anzumelden, reicht es aus, wenn Sie Ihre E-Mailadresse angeben. Optional bitten wir Sie einen Namen, zwecks persönlicher Ansprache im Newsletters anzugeben."
                        br {}
                        +"Der Versand des Newsletters und die mit ihm verbundene Erfolgsmessung erfolgen auf Grundlage einer Einwilligung der Empfänger gem . Art . 6 Abs. 1 lit. a, Art. 7 DSGVO i.V.m § 7 Abs. 2 Nr. 3 UWG oder falls eine Einwilligung nicht erforderlich ist, auf Grundlage unserer berechtigten Interessen am Direktmarketing gem. Art. 6 Abs. 1 lt. f. DSGVO i.V.m. § 7 Abs. 3 UWG."
                        br {}
                        +"Die Protokollierung des Anmeldeverfahrens erfolgt auf Grundlage unserer berechtigten Interessen gem.Art.6 Abs . 1 lit. f DSGVO. Unser Interesse richtet sich auf den Einsatz eines nutzerfreundlichen sowie sicheren Newslettersystems, das sowohl unseren geschäftlichen Interessen dient, als auch den Erwartungen der Nutzer entspricht und uns ferner den Nachweis von Einwilligungen erlaubt."
                        br {}
                        +"Kündigung / Widerruf - Sie können den Empfang unseres Newsletters jederzeit kündigen, d.h. Ihre Einwilligungen widerrufen. Einen Link zur Kündigung des Newsletters finden Sie am Ende eines jeden Newsletters. Wir können die ausgetragenen E-Mailadressen bis zu drei Jahren auf Grundlage unserer berechtigten Interessen speichern bevor wir sie löschen, um eine ehemals gegebene Einwilligung nachweisen zu können. Die Verarbeitung dieser Daten wird auf den Zweck einer möglichen Abwehr von Ansprüchen beschränkt. Ein individueller Löschungsantrag ist jederzeit möglich, sofern zugleich das ehemalige Bestehen einer Einwilligung bestätigt wird."
                    }
                }
                p {}
            }
            div {
                h3(classes = "dsg-hostingprovider") { +"Hosting und E - Mail - Versand" }
                p {
                    span(classes = "ts-muster-content") {
                        +"Die von uns in Anspruch genommenen Hosting - Leistungen dienen der Zurverfügungstellung der folgenden Leistungen: Infrastruktur-und Plattformdienstleistungen, Rechenkapazität, Speicherplatz und Datenbankdienste, E-Mail-Versand, Sicherheitsleistungen sowie technische Wartungsleistungen, die wir zum Zwecke des Betriebs dieses Onlineangebotes einsetzen."
                        br {}
                        br {}
                        +"Hierbei verarbeiten wir, bzw. unser Hostinganbieter Bestandsdaten, Kontaktdaten, Inhaltsdaten, Vertragsdaten, Nutzungsdaten, Meta-und Kommunikationsdaten von Kunden, Interessenten und Besuchern dieses Onlineangebotes auf Grundlage unserer berechtigten Interessen an einer effizienten und sicheren Zurverfügungstellung dieses Onlineangebotes gem. Art. 6 Abs. 1 lit. f DSGVO i.V.m. Art. 28 DSGVO (Abschluss Auftragsverarbeitungsvertrag)."
                    }
                }
                p {}
            }
            div {
                h3(classes = "dsg-logfiles") { +"Erhebung von Zugriffsdaten und Logfiles" }
                p {
                    span(classes = "ts-muster-content") {
                        +"Wir, bzw. unser Hostinganbieter, erhebt auf Grundlage unserer berechtigten Interessen im Sinne des Art. 6 Abs. 1 lit. f. DSGVO Daten über jeden Zugriff auf den Server, auf dem sich dieser Dienst befindet (sogenannte Serverlogfiles). Zu den Zugriffsdaten gehören Name der abgerufenen Webseite, Datei, Datum und Uhrzeit des Abrufs, übertragene Datenmenge, Meldung über erfolgreichen Abruf, Browsertyp nebst Version, das Betriebssystem des Nutzers, Referrer URL (die zuvor besuchte Seite), IP-Adresse und der anfragende Provider."
                        br {}
                        br {}
                        +"Logfile - Informationen werden aus Sicherheitsgründen (z.B.zur Aufklärung von Missbrauchs -oder Betrugshandlungen) für die Dauer von maximal 7 Tagen gespeichert und danach gelöscht . Daten, deren weitere Aufbewahrung zu Beweiszwecken erforderlich ist, sind bis zur endgültigen Klärung des jeweiligen Vorfalls von der Löschung ausgenommen."
                    }
                }
                p {}
            }
            div {
                h3(classes = "dsg-thirdparty-googlefonts") { +"Google Fonts" }
                p {
                    span(classes = "ts-muster-content") {
                        +"Wir binden die Schriftarten (\"Google Fonts\") des Anbieters Google LLC, 1600 Amphitheatre Parkway, Mountain View, CA 94043, USA, ein. Datenschutzerklärung: "
                        a(target = "_blank", href = "https://www.google.com/policies/privacy/") {
                            +"https://www.google.com/policies/privacy/"
                        }
                        +", Opt-Out: "
                        a(target = "_blank", href = "https://adssettings.google.com/authenticated") {
                            +"https://adssettings.google.com/authenticated"
                        }
                        br {}
                        br {}
                        a(target = "_blank", href = "https://datenschutz-generator.de", classes = "dsg1-5") {
                            +"Erstellt mit Datenschutz-Generator.de von RA Dr. Thomas Schwenke"
                        }
                    }
                }
            }
        }
    }
}


fun RBuilder.about() = child(About::class) {}