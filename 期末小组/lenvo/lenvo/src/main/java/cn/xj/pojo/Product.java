package cn.xj.pojo;

public class Product {
    private Integer id;

    private String name;

    private String price;

    private Integer collectednum;

    private Integer buynum;

    private String url;

    private Integer stock;

    private String pam1;

    private String pam2;

    private String pam3;

    private String val3;

    private String val2;

    private String val1;

    private Integer type;

    private Integer discount;

    private Integer categoryId1;

    private Integer categoryId2;

    private Integer isdelete;

    private String discription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getCollectednum() {
        return collectednum;
    }

    public void setCollectednum(Integer collectednum) {
        this.collectednum = collectednum;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPam1() {
        return pam1;
    }

    public void setPam1(String pam1) {
        this.pam1 = pam1 == null ? null : pam1.trim();
    }

    public String getPam2() {
        return pam2;
    }

    public void setPam2(String pam2) {
        this.pam2 = pam2 == null ? null : pam2.trim();
    }

    public String getPam3() {
        return pam3;
    }

    public void setPam3(String pam3) {
        this.pam3 = pam3 == null ? null : pam3.trim();
    }

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3 == null ? null : val3.trim();
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2 == null ? null : val2.trim();
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1 == null ? null : val1.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Integer categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Integer getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Integer categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }
}