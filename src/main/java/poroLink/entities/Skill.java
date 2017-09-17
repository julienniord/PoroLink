package poroLink.entities;

import java.util.ArrayList;

import poroLink.entities.base.BaseEntity;

public class Skill extends BaseEntity{


	 private String skill_name;
	 private int need;// == Post_Skill
	 private int own;// == Candidate_Skill
	 private int purcentageneeds;
	/**
     * Default constructor
     */
	 public Skill() {

	 }
    public Skill(String name, int need, int own) {
    	this.setSkill_name(name);
    	this.setNeed(need); 
    	this.setOwn(own); 
    }
    public Skill (String name) {
    	this.setSkill_name(name);
    }

	/**
	 * @return the needs
	 */
	public int getNeed() {
		return need;
	}


	/**
	 * @param needs the needs to set
	 */
	public void setNeed(int need) {
		this.need = need;
	}


	/**
	 * @return the owns
	 */
	public int getOwn() {
		return own;
	}


	/**
	 * @param owns the owns to set
	 */
	public void setOwn(int own) {
		this.own = own;
	}


	/**
	 * @return the skill_name
	 */
	public String getSkill_name() {
		return skill_name;
	}

	/**
	 * @param skill_name the skill_name to set
	 */
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}


	/**
	 * @return the purcentageneeds
	 */
	public int getPurcentageneeds() {
		return purcentageneeds;
	}


	/**
	 * @param purcentageneeds the purcentageneeds to set
	 */
	public void setPurcentageneeds(int purcentageneeds) {
		this.purcentageneeds = purcentageneeds;
	}



}

