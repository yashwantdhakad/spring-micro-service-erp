export const menuItems = [
    {
      path: '/',
      name: 'Home',
      nav: ['side'],
      meta: {
        title: 'Home',
        icon: 'home',
        requiredAuth: true,
        permissions: ['ADMIN']
      }
    },
    {
      name: 'Customer',
      nav: ['side'],
      meta: {
        title: 'Customer',
        icon: 'account_circle',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/customers',
          name: 'Customers',
          nav: ['side'],
          meta: {
            title: 'Customers',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/customers/create',
          name: 'Create Customer',
          nav: ['side'],
          meta: {
            title: 'Create Customer',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Supplier',
      nav: ['side'],
      meta: {
        title: 'Suppliers',
        icon: 'group',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/suppliers',
          name: 'Suppliers',
          nav: ['side'],
          meta: {
            title: 'Suppliers',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/suppliers/create',
          name: 'Create Supplier',
          nav: ['side'],
          meta: {
            title: 'Create Supplier',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Product',
      nav: ['side'],
      meta: {
        title: 'Product',
        icon: 'store-outline',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/products',
          name: 'Products',
          nav: ['side'],
          meta: {
            title: 'Products',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/products/create',
          name: 'Create Product',
          nav: ['side'],
          meta: {
            title: 'Create Product',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    // {
    //   name: 'Features',
    //   nav: ['side'],
    //   meta: {
    //     title: 'Features',
    //     icon: 'store-outline',
    //     requiredAuth: true,
    //     permissions: ['ADMIN']
    //   },
    //   children: [
    //     {
    //       path: '/features',
    //       name: 'Features',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Features',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //     {
    //       path: '/features/create',
    //       name: 'Create Feature',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Create Feature',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //   ],
    // },
    // {
    //   name: 'Feature Group',
    //   nav: ['side'],
    //   meta: {
    //     title: 'Feature Groups',
    //     icon: 'store-outline',
    //     requiredAuth: true,
    //     permissions: ['ADMIN']
    //   },
    //   children: [
    //     {
    //       path: '/featuregroups',
    //       name: 'Feature Groups',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Feature Groups',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //     {
    //       path: '/featuregroups/create',
    //       name: 'Create Feature Group',
    //       nav: ['side'],
    //       meta: {
    //         title: 'Create Feature Group',
    //         requiredAuth: true,
    //         permissions: ['ADMIN']
    //       }
    //     },
    //   ],
    // },
    {
      name: 'Category',
      nav: ['side'],
      meta: {
        title: 'Category',
        icon: 'category',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/category',
          name: 'Categories',
          nav: ['side'],
          meta: {
            title: 'Categories',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/category/create',
          name: 'Create Category',
          nav: ['side'],
          meta: {
            title: 'Create Category',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Order',
      nav: ['side'],
      meta: {
        title: 'Order',
        icon: 'shopping_cart',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/orders',
          name: 'Orders',
          nav: ['side'],
          meta: {
            title: 'Orders',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/orders/create',
          name: 'Create Order',
          nav: ['side'],
          meta: {
            title: 'Create Order',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'PO',
      nav: ['side'],
      meta: {
        title: 'PO',
        icon: 'shopping_cart',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/pos',
          name: 'POs',
          nav: ['side'],
          meta: {
            title: 'POs',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/pos/create',
          name: 'Create PO',
          nav: ['side'],
          meta: {
            title: 'Create PO',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Shipment',
      nav: ['side'],
      meta: {
        title: 'Shipment',
        icon: 'local_shipping',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/shipments',
          name: 'Shipments',
          nav: ['side'],
          meta: {
            title: 'Shipments',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/shipments/create',
          name: 'Create Shipment',
          nav: ['side'],
          meta: {
            title: 'Create Shipment',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Picklists',
      nav: ['side'],
      meta: {
        title: 'Picklists',
        icon: 'list_alt',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/picklists',
          name: 'Picklists',
          nav: ['side'],
          meta: {
            title: 'Picklists',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Facility',
      nav: ['side'],
      meta: {
        title: 'Facility',
        icon: 'warehouse',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/facilities',
          name: 'Facilities',
          nav: ['side'],
          meta: {
            title: 'Facilities',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/facilities/create',
          name: 'Create Facility',
          nav: ['side'],
          meta: {
            title: 'Create Facility',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Asset',
      nav: ['side'],
      meta: {
        title: 'Asset',
        icon: 'inventory',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/assets',
          name: 'Assets',
          nav: ['side'],
          meta: {
            title: 'Asset',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/assets/create',
          name: 'Create Asset',
          nav: ['side'],
          meta: {
            title: 'Create Asset',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    },
    {
      name: 'Manufacturing',
      nav: ['side'],
      meta: {
        title: 'Manufacturing',
        icon: 'factory',
        requiredAuth: true,
        permissions: ['ADMIN']
      },
      children: [
        {
          path: '/jobs',
          name: 'Jobs',
          nav: ['side'],
          meta: {
            title: 'Jobs',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
        {
          path: '/jobs/create',
          name: 'Create Job',
          nav: ['side'],
          meta: {
            title: 'Create Job',
            requiredAuth: true,
            permissions: ['ADMIN']
          }
        },
      ],
    }
  ];
