package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.StatusType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.ActorType;
import java.util.Map;

/**
 * Invoice details about the invoice status and state change
 * dates. 
 */
public class InvoiceDetailsType{


	/**
	 * Status of the invoice. 	  
	 *@Required	 
	 */ 
	private StatusType status;

	/**
	 * The total amount of the invoice (cost of items, shipping and
	 * tax, less any discount). This field is set by the invoicing
	 * system and will ignore any changes made by API callers. 	 
	 */ 
	private Double totalAmount;

	/**
	 * Whether the invoice was created via the website or via an
	 * API call. 	  
	 *@Required	 
	 */ 
	private OriginType origin;

	/**
	 * Date when the invoice was created. 	  
	 *@Required	 
	 */ 
	private String createdDate;

	/**
	 * Account that created the invoice. 	 
	 */ 
	private String createdBy;

	/**
	 * If canceled, date when the invoice was canceled. 	 
	 */ 
	private String canceledDate;

	/**
	 * Actor who canceled the invoice. 	 
	 */ 
	private ActorType canceledByActor;

	/**
	 * Account that canceled the invoice. 	 
	 */ 
	private String canceledBy;

	/**
	 * Date when the invoice was last edited. 	 
	 */ 
	private String lastUpdatedDate;

	/**
	 * Account that last edited the invoice. 	 
	 */ 
	private String lastUpdatedBy;

	/**
	 * Date when the invoice was first sent. 	 
	 */ 
	private String firstSentDate;

	/**
	 * Date when the invoice was last sent. 	 
	 */ 
	private String lastSentDate;

	/**
	 * Account that last sent the invoice. 	 
	 */ 
	private String lastSentBy;

	/**
	 * If the invoice was paid, date when the invoice was paid. 	 
	 */ 
	private String paidDate;

	

	/**
	 * Default Constructor
	 */
	public InvoiceDetailsType (){
	}	

	/**
	 * Getter for status
	 */
	 public StatusType getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(StatusType status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for totalAmount
	 */
	 public Double getTotalAmount() {
	 	return totalAmount;
	 }
	 
	/**
	 * Setter for totalAmount
	 */
	 public void setTotalAmount(Double totalAmount) {
	 	this.totalAmount = totalAmount;
	 }
	 
	/**
	 * Getter for origin
	 */
	 public OriginType getOrigin() {
	 	return origin;
	 }
	 
	/**
	 * Setter for origin
	 */
	 public void setOrigin(OriginType origin) {
	 	this.origin = origin;
	 }
	 
	/**
	 * Getter for createdDate
	 */
	 public String getCreatedDate() {
	 	return createdDate;
	 }
	 
	/**
	 * Setter for createdDate
	 */
	 public void setCreatedDate(String createdDate) {
	 	this.createdDate = createdDate;
	 }
	 
	/**
	 * Getter for createdBy
	 */
	 public String getCreatedBy() {
	 	return createdBy;
	 }
	 
	/**
	 * Setter for createdBy
	 */
	 public void setCreatedBy(String createdBy) {
	 	this.createdBy = createdBy;
	 }
	 
	/**
	 * Getter for canceledDate
	 */
	 public String getCanceledDate() {
	 	return canceledDate;
	 }
	 
	/**
	 * Setter for canceledDate
	 */
	 public void setCanceledDate(String canceledDate) {
	 	this.canceledDate = canceledDate;
	 }
	 
	/**
	 * Getter for canceledByActor
	 */
	 public ActorType getCanceledByActor() {
	 	return canceledByActor;
	 }
	 
	/**
	 * Setter for canceledByActor
	 */
	 public void setCanceledByActor(ActorType canceledByActor) {
	 	this.canceledByActor = canceledByActor;
	 }
	 
	/**
	 * Getter for canceledBy
	 */
	 public String getCanceledBy() {
	 	return canceledBy;
	 }
	 
	/**
	 * Setter for canceledBy
	 */
	 public void setCanceledBy(String canceledBy) {
	 	this.canceledBy = canceledBy;
	 }
	 
	/**
	 * Getter for lastUpdatedDate
	 */
	 public String getLastUpdatedDate() {
	 	return lastUpdatedDate;
	 }
	 
	/**
	 * Setter for lastUpdatedDate
	 */
	 public void setLastUpdatedDate(String lastUpdatedDate) {
	 	this.lastUpdatedDate = lastUpdatedDate;
	 }
	 
	/**
	 * Getter for lastUpdatedBy
	 */
	 public String getLastUpdatedBy() {
	 	return lastUpdatedBy;
	 }
	 
	/**
	 * Setter for lastUpdatedBy
	 */
	 public void setLastUpdatedBy(String lastUpdatedBy) {
	 	this.lastUpdatedBy = lastUpdatedBy;
	 }
	 
	/**
	 * Getter for firstSentDate
	 */
	 public String getFirstSentDate() {
	 	return firstSentDate;
	 }
	 
	/**
	 * Setter for firstSentDate
	 */
	 public void setFirstSentDate(String firstSentDate) {
	 	this.firstSentDate = firstSentDate;
	 }
	 
	/**
	 * Getter for lastSentDate
	 */
	 public String getLastSentDate() {
	 	return lastSentDate;
	 }
	 
	/**
	 * Setter for lastSentDate
	 */
	 public void setLastSentDate(String lastSentDate) {
	 	this.lastSentDate = lastSentDate;
	 }
	 
	/**
	 * Getter for lastSentBy
	 */
	 public String getLastSentBy() {
	 	return lastSentBy;
	 }
	 
	/**
	 * Setter for lastSentBy
	 */
	 public void setLastSentBy(String lastSentBy) {
	 	this.lastSentBy = lastSentBy;
	 }
	 
	/**
	 * Getter for paidDate
	 */
	 public String getPaidDate() {
	 	return paidDate;
	 }
	 
	/**
	 * Setter for paidDate
	 */
	 public void setPaidDate(String paidDate) {
	 	this.paidDate = paidDate;
	 }
	 


	public InvoiceDetailsType(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "status")){
			this.status = StatusType.fromValue(map.get(prefix + "status"));
		}
		if(map.containsKey(prefix + "totalAmount")){
			this.totalAmount = Double.valueOf(map.get(prefix + "totalAmount"));
		}
		if(map.containsKey(prefix + "origin")){
			this.origin = OriginType.fromValue(map.get(prefix + "origin"));
		}
		if(map.containsKey(prefix + "createdDate")){
			this.createdDate = map.get(prefix + "createdDate");
		}
		if(map.containsKey(prefix + "createdBy")){
			this.createdBy = map.get(prefix + "createdBy");
		}
		if(map.containsKey(prefix + "canceledDate")){
			this.canceledDate = map.get(prefix + "canceledDate");
		}
		if(map.containsKey(prefix + "canceledByActor")){
			this.canceledByActor = ActorType.fromValue(map.get(prefix + "canceledByActor"));
		}
		if(map.containsKey(prefix + "canceledBy")){
			this.canceledBy = map.get(prefix + "canceledBy");
		}
		if(map.containsKey(prefix + "lastUpdatedDate")){
			this.lastUpdatedDate = map.get(prefix + "lastUpdatedDate");
		}
		if(map.containsKey(prefix + "lastUpdatedBy")){
			this.lastUpdatedBy = map.get(prefix + "lastUpdatedBy");
		}
		if(map.containsKey(prefix + "firstSentDate")){
			this.firstSentDate = map.get(prefix + "firstSentDate");
		}
		if(map.containsKey(prefix + "lastSentDate")){
			this.lastSentDate = map.get(prefix + "lastSentDate");
		}
		if(map.containsKey(prefix + "lastSentBy")){
			this.lastSentBy = map.get(prefix + "lastSentBy");
		}
		if(map.containsKey(prefix + "paidDate")){
			this.paidDate = map.get(prefix + "paidDate");
		}
	}

}