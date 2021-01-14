package fri.prpo.stobiskovalcev.api.v1.dtos;

public class ProstorDto {
    private Integer prostor_id;
    private Integer uporabnikId;
    private Integer velikost;
    private Float trenutnaZasedenost;

    public ProstorDto(Integer prostor_id) {
        this.prostor_id = prostor_id;
    }

    public Integer getProstor_id() {
        return prostor_id;
    }

    public void setProstor_id(Integer prostor_id) {
        this.prostor_id = prostor_id;
    }

    public Integer getUporabnikId() {
        return uporabnikId;
    }

    public void setUporabnikId(Integer uporabnikId) {
        this.uporabnikId = uporabnikId;
    }

    public Integer getVelikost() {
        return velikost;
    }

    public void setVelikost(Integer velikost) {
        this.velikost = velikost;
    }

    public Float getTrenutnaZasedenost() {
        return trenutnaZasedenost;
    }

    public void setTrenutnaZasedenost(Float trenutnaZasedenost) {
        this.trenutnaZasedenost = trenutnaZasedenost;
    }
}
