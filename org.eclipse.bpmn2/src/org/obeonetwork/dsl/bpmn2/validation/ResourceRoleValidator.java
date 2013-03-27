/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.bpmn2.Resource;
import org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression;
import org.obeonetwork.dsl.bpmn2.ResourceParameterBinding;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.ResourceRole}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResourceRoleValidator {
	boolean validate();

	boolean validateResourceRef(Resource value);

	boolean validateResourceParameterBindings(
			EList<ResourceParameterBinding> value);

	boolean validateResourceAssignmentExpression(
			ResourceAssignmentExpression value);

	boolean validateName(String value);
}