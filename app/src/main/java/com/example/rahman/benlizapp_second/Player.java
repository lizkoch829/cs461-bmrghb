package com.example.rahman.benlizapp_second;



public class Player {
    // first name,last name, position, acrued seasons, base salary, prorated bonus, roster bonus, ,
    //workout bonus, cap number, cut projected dead money, june 1 proj dead money, trade proj dm
    //next year trade proj dm, restruct dm, extend dm, june 1 cut dm gain loss, trade dm gain/loss
    //restructure dm gain/loss, xtend dm gain/loss

    //instance variables
    String first_name;
    String last_name;
    int position;
    int seasons;
    int base_salary;
    int prorated_bonus;
    int roster_bonus;
    int workout_bonus;
    int cap_number;
    int projected_dm;
    int june1_projected_dm;
    int trade_projected_dm;
    int next_year_trade_projected_dm;
    int restruct_dm;
    int extend_dm;
    int june1_cut_dm_gain_loss;
    int trade_dm_gain_loss;
    int restructure_dm_gain_loss;
    int extend_dm_gain_loss;

    public Player( String first_name,String last_name,int position, int seasons, int base_salary,
                   int prorated_bonus,int roster_bonus,int workout_bonus,int cap_number,
                   int projected_dm,int june1_projected_dm, int trade_projected_dm,
                   int next_year_trade_projected_dm,int restruct_dm, int extend_dm,
                   int june1_cut_dm_gain_loss, int trade_dm_gain_loss, int restructure_dm_gain_loss,
                    int extend_dm_gain_loss)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.position=position;
        this.seasons=seasons;
        this.base_salary=base_salary;
        this.prorated_bonus=prorated_bonus;
        this.roster_bonus=roster_bonus;
        this.workout_bonus=workout_bonus;
        this.cap_number=cap_number;
        this.projected_dm=projected_dm;
        this.june1_projected_dm=june1_projected_dm;
        this.trade_projected_dm=trade_projected_dm;
        this.next_year_trade_projected_dm=next_year_trade_projected_dm;
        this.restruct_dm=restruct_dm;
        this.extend_dm=extend_dm;
        this.june1_cut_dm_gain_loss=june1_cut_dm_gain_loss;
        this.trade_dm_gain_loss=trade_dm_gain_loss;
        this.restructure_dm_gain_loss=restructure_dm_gain_loss;
        this.extend_dm_gain_loss=extend_dm_gain_loss;
    }




    public String get_first_name()
    {
        return first_name;
    }
    public String get_last_name()
    {
        return last_name;
    }
    public int get_position()
    {
        return position;
    }
    public int get_seasons()
    {
        return seasons;
    }
    public int get_base_salary()
    {
        return base_salary;
    }
    public int get_prorated_bonus()
    {
        return prorated_bonus;
    }
    public int get_roster_bonus()
    {
        return roster_bonus;
    }
    public int get_workout_bonus()
    {
        return workout_bonus;
    }
    public int get_cap_number()
    {
        return cap_number;
    }
    public int get_projected_dm()
    {
        return projected_dm;
    }
    public int get_june1_projected_dm()
    {
        return june1_projected_dm;
    }
    public int get_trade_projected_dm()
    {
        return trade_projected_dm;
    }
    public int get_next_year_trade_projected_dm()
    {
        return next_year_trade_projected_dm;
    }
    public int get_restruct_dm()
    {
        return restruct_dm;
    }
    public int get_extend_dm()
    {
        return extend_dm;
    }
    public int get_june1_cut_dm_gain_loss()
    {
        return june1_cut_dm_gain_loss;
    }
    public int get_trade_dm_gain_loss()
    {
        return trade_dm_gain_loss;
    }
    public int get_restructure_dm_gain_loss()
    {
        return restructure_dm_gain_loss;
    }
    public int get_extend_dm_gain_loss()
    {
        return extend_dm_gain_loss;
    }

    //third activity
    //name, position, #seasons, base salary, guaranteed salary, cut spinner (june 1 cut, extension,
    // restructure ,trade)

}
