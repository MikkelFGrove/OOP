package Module1_1.Types;

// Når vi godt vil konvertere mellem int værdier og long værdier skal der udføres
// et cast. Men, hvornår er det at dette cast skal gøres eksplicit, og hvornår må
// det være implicit?
//          Dette skal gøre eksplicit når man går fra mere præcis til mindre præcis for eksempl float -> int

// Hvorved adskilder int og long sig?
//          Ved værdien 2147483647, dette er den højest mulige int værdi og for at repræsentere højere værdier
//          skal man derfor bruge long
public class Casting {
    public static void main(String[] args) {
        int i = 5;
        long l = i;
        i = (int)l;
    }
}
