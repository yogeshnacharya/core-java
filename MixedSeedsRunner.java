class MixedSeedsRunner {
public static void main(String [] max)
{
MixedSeeds.refInt=179;
MixedSeeds.refByte=117;
MixedSeeds.refShort=20768;
MixedSeeds.refFloat=460.97f;
MixedSeeds.refDouble=310.80966089;
MixedSeeds.refLong=7816965780L;
MixedSeeds.refBoolean=true;
MixedSeeds.refString="Mixed Seeds";
MixedSeeds.refChar='7';
System.out.println("Int default value:"+MixedSeeds.refInt);
System.out.println("Float default value:"+MixedSeeds.refFloat);
System.out.println("Short default value:"+MixedSeeds.refShort);
System.out.println("Byte default value:"+MixedSeeds.refByte);
System.out.println("Double default value:"+MixedSeeds.refDouble);
System.out.println("Long default value:"+MixedSeeds.refLong);
System.out.println("Boolean default value:"+MixedSeeds.refBoolean);
System.out.println("String default value:"+MixedSeeds.refString);
System.out.println("Char default value:"+MixedSeeds.refChar);
}
}