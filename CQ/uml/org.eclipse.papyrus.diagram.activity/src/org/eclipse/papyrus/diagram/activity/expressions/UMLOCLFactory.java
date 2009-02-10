/*******************************************************************************
 * Copyright (c) 2008 
 * Conselleria de Infraestructuras y Transporte, Generalitat de la Comunitat Valenciana .
 * All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *	  Francisco Javier Cano Muñoz (Prodevelop) - initial API implementation
 ******************************************************************************/
package org.eclipse.papyrus.diagram.activity.expressions;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.AbstractVisitor;
import org.eclipse.ocl.utilities.PredefinedType;
import org.eclipse.papyrus.diagram.common.parser.lookup.OCLLookup;

/**
 * @generated
 */
public class UMLOCLFactory {

	/**
	 * @generated
	 */
	private UMLOCLFactory() {
	}

	/**
	 * @generated
	 */
	public static UMLAbstractExpression getExpression(String body, EClassifier context, Map environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * @generated
	 */
	public static UMLAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.EMPTY_MAP);
	}

	/**
	 * @generated
	 */
	private static class Expression extends UMLAbstractExpression {

		/**
		 * @generated
		 */
		private WeakReference queryRef;

		/**
		 * @generated
		 */
		private final OCL oclInstance;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context, Map environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
		}

		/**
		 * @generated
		 */
		protected Query getQuery() {
			Query oclQuery = null;
			if (this.queryRef != null) {
				oclQuery = (Query) this.queryRef.get();
			}
			if (oclQuery == null) {
				OCLHelper oclHelper = oclInstance.createOCLHelper();
				oclHelper.setContext(context());
				try {
					OCLExpression oclExpression = oclHelper.createQuery(body());
					oclQuery = oclInstance.createQuery(oclExpression);
					this.queryRef = new WeakReference(oclQuery);
					setStatus(IStatus.OK, null, null);
				} catch (ParserException e) {
					setStatus(IStatus.ERROR, e.getMessage(), e);
				}
			}
			return oclQuery;
		}

		/**
		 * @generated
		 */
		@Override
		protected Object doEvaluate(Object context, Map env) {
			Query oclQuery = getQuery();
			if (oclQuery == null) {
				return null;
			}
			EvaluationEnvironment evalEnv = oclQuery.getEvaluationEnvironment();
			// init environment
			for (Iterator it = env.entrySet().iterator(); it.hasNext();) {
				Map.Entry nextEntry = (Map.Entry) it.next();
				evalEnv.replace((String) nextEntry.getKey(), nextEntry.getValue());
			}
			try {
				initExtentMap(context);
				Object result = oclQuery.evaluate(context);
				return (result != oclInstance.getEnvironment().getOCLStandardLibrary().getOclInvalid()) ? result : null;
			} finally {
				evalEnv.clear();
				oclQuery.getExtentMap().clear();
			}
		}

		/**
		 * @generated
		 */
		private void initExtentMap(Object context) {
			if (!getStatus().isOK() || context == null) {
				return;
			}
			final Query queryToInit = getQuery();
			final Object extentContext = context;
			queryToInit.getExtentMap().clear();
			if (queryToInit.queryText() != null && queryToInit.queryText().indexOf(PredefinedType.ALL_INSTANCES_NAME) >= 0) {
				AbstractVisitor visitior = new AbstractVisitor() {

					private boolean usesAllInstances = false;

					@Override
					public Object visitOperationCallExp(OperationCallExp oc) {
						if (!usesAllInstances) {
							usesAllInstances = PredefinedType.ALL_INSTANCES == oc.getOperationCode();
							if (usesAllInstances) {
								queryToInit.getExtentMap().putAll(oclInstance.getEvaluationEnvironment().createExtentMap(extentContext));
							}
						}
						return super.visitOperationCallExp(oc);
					}
				};
				queryToInit.getExpression().accept(visitior);
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(Environment ecoreEnv, Map environment) {
			for (Iterator it = environment.keySet().iterator(); it.hasNext();) {
				String varName = (String) it.next();
				EClassifier varType = (EClassifier) environment.get(varName);
				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(Environment ecoreEnv, String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}

	/**
	 * @generated
	 */
	public static OCLLookup.Expression getOCLLookupExpression(String body, EClassifier context) {
		final UMLAbstractExpression expression = getExpression(body, context);
		if (!expression.getStatus().isOK()) {
			throw new IllegalArgumentException("Bad OCL:" + body);
		}
		return new OCLLookup.Expression() {

			public Object evaluate(Object context) {
				return expression.evaluate(context);
			}
		};
	}
}
