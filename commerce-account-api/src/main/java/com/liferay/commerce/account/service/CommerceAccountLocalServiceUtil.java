/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.account.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CommerceAccount. This utility wraps
 * {@link com.liferay.commerce.account.service.impl.CommerceAccountLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Marco Leo
 * @see CommerceAccountLocalService
 * @see com.liferay.commerce.account.service.base.CommerceAccountLocalServiceBaseImpl
 * @see com.liferay.commerce.account.service.impl.CommerceAccountLocalServiceImpl
 * @generated
 */
@ProviderType
public class CommerceAccountLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.commerce.account.service.impl.CommerceAccountLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the commerce account to the database. Also notifies the appropriate model listeners.
	*
	* @param commerceAccount the commerce account
	* @return the commerce account that was added
	*/
	public static com.liferay.commerce.account.model.CommerceAccount addCommerceAccount(
		com.liferay.commerce.account.model.CommerceAccount commerceAccount) {
		return getService().addCommerceAccount(commerceAccount);
	}

	public static com.liferay.commerce.account.model.CommerceAccount addCommerceAccount(
		String name, long parentCommerceAccountId, String email, String taxId,
		boolean active, String externalReferenceCode, long[] userIds,
		String[] emailAddresses,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addCommerceAccount(name, parentCommerceAccountId, email,
			taxId, active, externalReferenceCode, userIds, emailAddresses,
			serviceContext);
	}

	public static com.liferay.commerce.account.model.CommerceAccount addCommerceAccount(
		String name, long parentCommerceAccountId, String email, String taxId,
		boolean active, String externalReferenceCode,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addCommerceAccount(name, parentCommerceAccountId, email,
			taxId, active, externalReferenceCode, serviceContext);
	}

	/**
	* Creates a new commerce account with the primary key. Does not add the commerce account to the database.
	*
	* @param commerceAccountId the primary key for the new commerce account
	* @return the new commerce account
	*/
	public static com.liferay.commerce.account.model.CommerceAccount createCommerceAccount(
		long commerceAccountId) {
		return getService().createCommerceAccount(commerceAccountId);
	}

	/**
	* Deletes the commerce account from the database. Also notifies the appropriate model listeners.
	*
	* @param commerceAccount the commerce account
	* @return the commerce account that was removed
	* @throws PortalException
	*/
	public static com.liferay.commerce.account.model.CommerceAccount deleteCommerceAccount(
		com.liferay.commerce.account.model.CommerceAccount commerceAccount)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCommerceAccount(commerceAccount);
	}

	/**
	* Deletes the commerce account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commerceAccountId the primary key of the commerce account
	* @return the commerce account that was removed
	* @throws PortalException if a commerce account with the primary key could not be found
	*/
	public static com.liferay.commerce.account.model.CommerceAccount deleteCommerceAccount(
		long commerceAccountId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCommerceAccount(commerceAccountId);
	}

	public static void deleteLogo(long commerceAccountId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteLogo(commerceAccountId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.account.model.impl.CommerceAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.account.model.impl.CommerceAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.commerce.account.model.CommerceAccount fetchCommerceAccount(
		long commerceAccountId) {
		return getService().fetchCommerceAccount(commerceAccountId);
	}

	public static com.liferay.commerce.account.model.CommerceAccount fetchCommerceAccount(
		long companyId, String name) {
		return getService().fetchCommerceAccount(companyId, name);
	}

	/**
	* Returns the commerce account with the matching external reference code and company.
	*
	* @param companyId the primary key of the company
	* @param externalReferenceCode the commerce account's external reference code
	* @return the matching commerce account, or <code>null</code> if a matching commerce account could not be found
	*/
	public static com.liferay.commerce.account.model.CommerceAccount fetchCommerceAccountByReferenceCode(
		long companyId, String externalReferenceCode) {
		return getService()
				   .fetchCommerceAccountByReferenceCode(companyId,
			externalReferenceCode);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the commerce account with the primary key.
	*
	* @param commerceAccountId the primary key of the commerce account
	* @return the commerce account
	* @throws PortalException if a commerce account with the primary key could not be found
	*/
	public static com.liferay.commerce.account.model.CommerceAccount getCommerceAccount(
		long commerceAccountId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCommerceAccount(commerceAccountId);
	}

	/**
	* Returns a range of all the commerce accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.account.model.impl.CommerceAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce accounts
	* @param end the upper bound of the range of commerce accounts (not inclusive)
	* @return the range of commerce accounts
	*/
	public static java.util.List<com.liferay.commerce.account.model.CommerceAccount> getCommerceAccounts(
		int start, int end) {
		return getService().getCommerceAccounts(start, end);
	}

	/**
	* Returns the number of commerce accounts.
	*
	* @return the number of commerce accounts
	*/
	public static int getCommerceAccountsCount() {
		return getService().getCommerceAccountsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static java.util.List<com.liferay.commerce.account.model.CommerceAccount> getUserCommerceAccounts(
		long userId, Long parentCommerceAccountId, String keywords, int start,
		int end) {
		return getService()
				   .getUserCommerceAccounts(userId, parentCommerceAccountId,
			keywords, start, end);
	}

	public static int getUserCommerceAccountsCount(long userId,
		Long parentCommerceAccountId, String keywords) {
		return getService()
				   .getUserCommerceAccountsCount(userId,
			parentCommerceAccountId, keywords);
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.account.model.CommerceAccount> searchCommerceAccounts(
		long companyId, long parentCommerceAccountId, String keywords,
		Boolean active, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .searchCommerceAccounts(companyId, parentCommerceAccountId,
			keywords, active, start, end, sort);
	}

	/**
	* Updates the commerce account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param commerceAccount the commerce account
	* @return the commerce account that was updated
	*/
	public static com.liferay.commerce.account.model.CommerceAccount updateCommerceAccount(
		com.liferay.commerce.account.model.CommerceAccount commerceAccount) {
		return getService().updateCommerceAccount(commerceAccount);
	}

	public static com.liferay.commerce.account.model.CommerceAccount updateCommerceAccount(
		long commerceAccountId, String name, boolean logo, byte[] logoBytes,
		String email, String taxId, boolean active,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateCommerceAccount(commerceAccountId, name, logo,
			logoBytes, email, taxId, active, serviceContext);
	}

	public static com.liferay.commerce.account.model.CommerceAccount updateStatus(
		long userId, long commerceAccountId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.util.Map<String, java.io.Serializable> workflowContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateStatus(userId, commerceAccountId, status,
			serviceContext, workflowContext);
	}

	public static com.liferay.commerce.account.model.CommerceAccount upsertCommerceAccount(
		String name, long parentCommerceAccountId, boolean logo,
		byte[] logoBytes, String email, String taxId, boolean active,
		String externalReferenceCode,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .upsertCommerceAccount(name, parentCommerceAccountId, logo,
			logoBytes, email, taxId, active, externalReferenceCode,
			serviceContext);
	}

	public static CommerceAccountLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CommerceAccountLocalService, CommerceAccountLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CommerceAccountLocalService.class);

		ServiceTracker<CommerceAccountLocalService, CommerceAccountLocalService> serviceTracker =
			new ServiceTracker<CommerceAccountLocalService, CommerceAccountLocalService>(bundle.getBundleContext(),
				CommerceAccountLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}