package group27.xukai.cpt202b.entity;

import java.util.Date;

public class Trainer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.trainer_ID
     *
     * @mbggenerated
     */
    private Integer trainerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.honour
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.honour
     *
     * @mbggenerated
     */
    private String honour;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.experience
     *
     * @mbggenerated
     */
    private String experience;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.entrytime
     *
     * @mbggenerated
     */
    private Date entrytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.starlevel
     *
     * @mbggenerated
     */
    private String starlevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.trainer_ID
     *
     * @return the value of trainer.trainer_ID
     *
     * @mbggenerated
     */
    private String customerevaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trainer.honour
     *
     * @mbggenerated
     */
    public Integer getTrainerId() {
        return trainerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.trainer_ID
     *
     * @param trainerId the value for trainer.trainer_ID
     *
     * @mbggenerated
     */
    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.name
     *
     * @return the value of trainer.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.name
     *
     * @param name the value for trainer.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.sex
     *
     * @return the value of trainer.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.sex
     *
     * @param sex the value for trainer.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.honour
     *
     * @return the value of trainer.honour
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.sex
     *
     * @param email the value for trainer.sex
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.honour
     *
     * @return the value of trainer.honour
     *
     * @mbggenerated
     */
    public String getHonour() {
        return honour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.honour
     *
     * @param honour the value for trainer.honour
     *
     * @mbggenerated
     */
    public void setHonour(String honour) {
        this.honour = honour == null ? null : honour.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.experience
     *
     * @return the value of trainer.experience
     *
     * @mbggenerated
     */
    public String getExperience() {
        return experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.experience
     *
     * @param experience the value for trainer.experience
     *
     * @mbggenerated
     */
    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.entrytime
     *
     * @return the value of trainer.entrytime
     *
     * @mbggenerated
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.entrytime
     *
     * @param entrytime the value for trainer.entrytime
     *
     * @mbggenerated
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.starlevel
     *
     * @return the value of trainer.starlevel
     *
     * @mbggenerated
     */
    public String getStarlevel() {
        return starlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.starlevel
     *
     * @param starlevel the value for trainer.starlevel
     *
     * @mbggenerated
     */
    public void setStarlevel(String starlevel) {
        this.starlevel = starlevel == null ? null : starlevel.trim();
    }
    public String getCustomerevaluation() {
        return customerevaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trainer.sex
     *
     * @param customerevaluation the value for trainer.sex
     *
     * @mbggenerated
     */
    public void setCustomerevaluation(String customerevaluation) {
        this.customerevaluation = customerevaluation == null ? null : customerevaluation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trainer.honour
     *
     * @return the value of trainer.honour
     *
     * @mbggenerated
     */
}