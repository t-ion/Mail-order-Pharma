package com.mailorderpharma.subscription.entitytest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import com.mailorderpharma.subscription.entity.SubscriptionDetails;


public class SubscriptionDetailsTest {

	SubscriptionDetails subscriptionDetails = new SubscriptionDetails(12001L, 1, 2, "member", LocalDate.now(),
			"chennai", "paid", "drug1");
	SubscriptionDetails subscriptionDetails2 = new SubscriptionDetails();
	SubscriptionDetails subscriptionDetails3 = new SubscriptionDetails(12001L,12001L,"Drug1", 1, 2, "member", LocalDate.now(),
			"chennai", "paid");

	@Test
	public void test() {
		subscriptionDetails2.setPrescriptionId(subscriptionDetails.getPrescriptionId());
		subscriptionDetails2.setRefillCycle(subscriptionDetails.getRefillCycle());
		subscriptionDetails2.setQuantity(subscriptionDetails.getQuantity());
		subscriptionDetails2.setMemberId(subscriptionDetails.getMemberId());
		subscriptionDetails2.setSubscriptionDate(subscriptionDetails.getSubscriptionDate());
		subscriptionDetails2.setMemberLocation(subscriptionDetails.getMemberLocation());
		subscriptionDetails2.setSubscriptionStatus(subscriptionDetails.getSubscriptionStatus());
		subscriptionDetails2.setDrugName(subscriptionDetails.getDrugName());
		subscriptionDetails2.setSubscriptionId(subscriptionDetails3.getSubscriptionId());
		assertEquals(subscriptionDetails2.getDrugName(),subscriptionDetails.getDrugName());
		assertEquals(subscriptionDetails2.getSubscriptionStatus(),subscriptionDetails.getSubscriptionStatus());
		assertEquals(subscriptionDetails2.getMemberLocation(),subscriptionDetails.getMemberLocation());
		assertEquals(subscriptionDetails2.getSubscriptionDate(),subscriptionDetails.getSubscriptionDate());
		assertEquals(subscriptionDetails2.getMemberId(),subscriptionDetails.getMemberId());
		assertEquals(subscriptionDetails2.getQuantity(),subscriptionDetails.getQuantity());
		assertEquals(subscriptionDetails2.getRefillCycle(),subscriptionDetails.getRefillCycle());
		assertEquals(subscriptionDetails2.getPrescriptionId(),subscriptionDetails.getPrescriptionId());
		assertEquals(subscriptionDetails2.getSubscriptionId(), subscriptionDetails3.getSubscriptionId());
	}
}
