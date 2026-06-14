package Abstact_interfece_Exier;

// create an interface Tvremote and use it to inherit another interce samrtTvremote 
interface Tvremote{
    void battens();
    void light();
}

interface SmartTvremote extends Tvremote{
    void smartswith();
}

