package no.olseng.sandbox.model

class SampleData {
    companion object {
        val sampleMessageList = listOf(
            Message("Bernt Rune", "Jeg hater fisk, det smaker ugle!"),
            Message("Bernt Roger", "Fisk er digg, din nørd :)"),
            Message("Fleinmøy", "Jeg syntes ikke dere er noe hyggelige med hverandre. Kan dere ikke bare være venner?"),
            Message("Ulf Ståle", "Enig med Fleinmøy. Men fisk smaker dritt!"),
            Message("Bernt Rune", "Hør på Ulf Ståle! For en knakanes kar!"),
            Message("Anne-Borghild", "Bernt Rune og Ulf Ståle, dere er duster! Fisk er sunt, spesielt Makrell! Kom til meg på middag for panert Makrell, med gulrøtter, pasta og timian"),
            Message("Fleinmøy", "Jeg kommer!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
            Message("Anne-Borghild", "Du er ikke invitert, Fleinmøy!"),
        )
        val enormousSampleMessageList = List(1000) {
            Message("${it.toChar()}", "Melding")

        }

        val sampleMessage = Message(
            "Blemmefar",
            "For there is no sun that can cover these shadows."
        )
    }
}