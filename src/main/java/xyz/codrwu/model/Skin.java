package xyz.codrwu.model;

public class Skin {
    private String skinId;

    private String skinName;

    private String heroId;

    private Integer skinPrice;

    private Integer num;

    public String getSkinId() {
        return skinId;
    }

    public void setSkinId(String skinId) {
        this.skinId = skinId == null ? null : skinId.trim();
    }

    public String getSkinName() {
        return skinName;
    }

    public void setSkinName(String skinName) {
        this.skinName = skinName == null ? null : skinName.trim();
    }

    public String getHeroId() {
        return heroId;
    }

    public void setHeroId(String heroId) {
        this.heroId = heroId == null ? null : heroId.trim();
    }

    public Integer getSkinPrice() {
        return skinPrice;
    }

    public void setSkinPrice(Integer skinPrice) {
        this.skinPrice = skinPrice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}