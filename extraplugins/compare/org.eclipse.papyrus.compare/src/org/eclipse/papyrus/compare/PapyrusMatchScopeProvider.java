package org.eclipse.papyrus.compare;

import org.eclipse.emf.compare.match.engine.GenericMatchScopeProvider;
import org.eclipse.emf.compare.match.engine.IMatchScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.util.UMLUtil;


public class PapyrusMatchScopeProvider extends GenericMatchScopeProvider {

	public PapyrusMatchScopeProvider(Resource leftResource, Resource rightResource) {
		super(leftResource, rightResource);
	}

	@Override
	public IMatchScope getLeftScope() {
		return new PapyrusMatchScope(super.getLeftScope());
	}

	@Override
	public IMatchScope getRightScope() {
		return new PapyrusMatchScope(super.getRightScope());
	}

	private static class PapyrusMatchScope implements IMatchScope {

		private final IMatchScope myScope;

		private PapyrusMatchScope(IMatchScope scope) {
			myScope = scope;
		}

		public boolean isInScope(EObject eObject) {
			return myScope.isInScope(eObject) && !isStereotypeApplication(eObject);
		}

		public boolean isInScope(Resource resource) {
			return myScope.isInScope(resource);
		}

		private boolean isStereotypeApplication(EObject eObject) {
			return UMLUtil.getStereotype(eObject) != null;
		}
	}

}
